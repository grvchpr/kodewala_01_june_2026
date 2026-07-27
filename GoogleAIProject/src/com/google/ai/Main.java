package com.google.ai;

import com.google.genai.Client;
import com.google.genai.types.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;

import com.google.common.io.ByteSource;
import com.google.common.io.Files;
import com.google.common.io.Resources;

public class  Main{
  public static void main(String[] args) {
    String apiKey = System.getenv("GEMINI_API_KEY");
    if ((apiKey == null || apiKey.isEmpty()) && args.length > 0) {
      apiKey = args[0].trim();
    }
    if (apiKey == null || apiKey.isEmpty()) {
      System.err.println("Error: Gemini API key is not set.");
      System.err.println("Provide it in one of these ways:");
      System.err.println("  1) export GEMINI_API_KEY='your-api-key-here'");
      System.err.println("  2) java com.google.ai.Main 'your-api-key-here'");
      System.exit(1);
    }
    Client client = Client.builder().apiKey(apiKey).build();



    GenerateVideosSource source =
        GenerateVideosSource.builder()
            .prompt("**Title: \"When You Open Your Laptop to Study\"**\n\n👨‍🎓 **Student:**\nToday I will study for 5 hours straight. No distractions!\n\n*(Opens laptop)*\n\n💻 **Laptop:**\n\"Good morning! You have 27 unread notifications.\"\n\n👨‍🎓\nIgnore. Focus mode ON.\n\n📱 **Phone:**\n*Ping!* \"Your friend sent you a meme.\"\n\n👨‍🎓\nJust one meme...\n\n*(10 minutes later)*\n\n👨‍🎓\nOkay, now seriously, study time.\n\n📺 **YouTube:**\n\"Recommended: How billionaires wake up at 4 AM.\"\n\n👨‍🎓\nThis could improve my life...\n\n*(30 minutes later)*\n\n📺 **YouTube:**\n\"Next video: Why cats secretly rule the world.\"\n\n👨‍🎓\nInteresting research topic.\n\n*(2 hours later)*\n\n👩 Mom from another room:\nHow much did you study?\n\n👨‍🎓\nA lot! I now know:\n\n* How to become a billionaire\n* Why cats are dangerous\n* Top 10 places to visit before 30\n\n👩 Mom:\nAnd your syllabus?\n\n👨‍🎓\nStill buffering...")
            .build();

    GenerateVideosOperation operation = client.models.generateVideos(
      "veo-3.1-fast-generate-preview",
      source,
      GenerateVideosConfig.builder()
        .personGeneration("dont_allow")
        .aspectRatio("16:9")
        .numberOfVideos(1)
        .durationSeconds(8)
        .resolution("720p")
        .build()
    );

    while (!operation.done().orElse(false)) {
      System.out.println("Video has not been generated yet. Check again in 10 seconds...");
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        // ignore
      }
      operation = client.operations.getVideosOperation(operation, null);
    }

    if (operation.response().isEmpty()) {
      System.err.println("Error occurred while generating video.");
      return;
    }

    Optional<List<GeneratedVideo>> generatedVideos = operation.response().get().generatedVideos();

    if (generatedVideos.isEmpty()) {
      System.err.println("No video was generated.");
      return;
    }

    System.out.println("Generated " + generatedVideos.get().size() + " video(s).");

    for (int i = 0; i < generatedVideos.get().size(); i++) {
      GeneratedVideo generatedVideo = generatedVideos.get().get(i);
      String videoUri = generatedVideo.video().get().uri().get();
      System.out.println("Generated video: " + videoUri);
      String urlString = videoUri + "&key=" + apiKey;
      String fileName = "video_" + i + ".mp4";
      File destinationFile = new File(fileName);

      try {
        URL sourceUrl = new URL(urlString);
        ByteSource byteSource = Resources.asByteSource(sourceUrl);
        byteSource.copyTo(Files.asByteSink(destinationFile));
        System.out.println("Video " + videoUri + " has been downloaded to video_" + i + ".mp4.");
      } catch (IOException e) {
        System.err.println("Error downloading file: " + e.getMessage());
      }
    }
  }
}


