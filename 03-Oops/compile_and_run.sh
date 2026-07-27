#!/bin/bash

# PhonePe Application Test/Demo Script
# This script demonstrates the PhonePe application functionality

PROJECT_DIR="/Users/gourav/Downloads/Kodewala Academy/03-Oops"

echo "╔════════════════════════════════════════════════╗"
echo "║   PhonePe Application - Compilation & Setup    ║"
echo "╚════════════════════════════════════════════════╝"
echo ""

# Navigate to project directory
cd "$PROJECT_DIR"

echo "📦 Compiling all Java files..."
echo ""

# Compile all files
javac -d bin \
    src/com/phonepe/account/User.java \
    src/com/phonepe/transaction/Transaction.java \
    src/com/phonepe/wallet/Wallet.java \
    src/com/phonepe/driver/Driver.java

if [ $? -eq 0 ]; then
    echo "✓ Compilation successful!"
    echo ""
    echo "📂 Compiled class files:"
    find bin/com/phonepe -name "*.class" | sort
    echo ""
    echo "╔════════════════════════════════════════════════╗"
    echo "║   To run the application, execute:             ║"
    echo "║                                                ║"
    echo "║   cd \"$PROJECT_DIR\"        ║"
    echo "║   java -cp bin com.phonepe.driver.Driver     ║"
    echo "║                                                ║"
    echo "╚════════════════════════════════════════════════╝"
else
    echo "✗ Compilation failed!"
    exit 1
fi
