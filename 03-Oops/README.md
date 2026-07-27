# PhonePe-like Application

A Java-based digital payment wallet application that simulates the core functionality of PhonePe.

## Project Structure

```
03-Oops/
├── src/
│   └── com/
│       └── phonepe/
│           ├── account/
│           │   └── User.java              # User account with balance and transaction methods
│           ├── transaction/
│           │   └── Transaction.java       # Transaction tracking with history
│           ├── wallet/
│           │   └── Wallet.java            # Wallet management and operations
│           └── driver/
│               └── Driver.java            # Interactive menu-driven interface
└── bin/                                   # Compiled .class files
```

## Features

### 1. **User Account Management**
   - Create a new account with name, phone number, and UPI ID
   - View account balance
   - User profile information

### 2. **Wallet Operations**
   - **Add Money**: Top up your wallet with cash
   - **Send Money**: Transfer money to another UPI ID
   - **Receive Money**: Receive money from other users
   - **Check Balance**: View current wallet balance

### 3. **Transaction History**
   - Track all transactions (sent, received, added)
   - View detailed transaction information
   - Transaction ID and timestamp
   - Transaction status

### 4. **User-Friendly Interface**
   - Interactive menu-driven system
   - Beautiful ASCII art interface with borders
   - Input validation and error handling
   - Real-time balance updates

## How to Run

### 1. Compile the Code
```bash
cd "/Users/gourav/Downloads/Kodewala Academy/03-Oops"
javac -d bin src/com/phonepe/account/User.java \
              src/com/phonepe/transaction/Transaction.java \
              src/com/phonepe/wallet/Wallet.java \
              src/com/phonepe/driver/Driver.java
```

### 2. Run the Application
```bash
cd "/Users/gourav/Downloads/Kodewala Academy/03-Oops"
java -cp bin com.phonepe.driver.Driver
```

## Classes Description

### 1. **User.java** (`com.phonepe.account`)
Represents a user account with the following attributes:
- `name`: User's full name
- `phoneNumber`: User's phone number
- `upiId`: User's UPI identifier
- `balance`: Current wallet balance

Key methods:
- `addMoney(amount)`: Add money to wallet
- `sendMoney(amount, recipientUPI)`: Send money to another user
- `receiveMoney(amount, senderUPI)`: Receive money from another user
- Getters and setters for all attributes

### 2. **Transaction.java** (`com.phonepe.transaction`)
Records transaction details:
- `transactionId`: Unique transaction identifier
- `type`: Type of transaction (SENT, RECEIVED, ADDED)
- `amount`: Transaction amount
- `otherPartyUPI`: UPI of the other party
- `timestamp`: Date and time of transaction
- `status`: Transaction status (SUCCESS, PENDING, FAILED)

### 3. **Wallet.java** (`com.phonepe.wallet`)
Manages wallet operations and transaction history:
- Maintains user information
- Manages transaction history list
- Provides methods to perform wallet operations
- Displays wallet information and transaction history

Key methods:
- `displayBalance()`: Show current balance
- `addMoneyToWallet(amount)`: Add money
- `sendMoney(amount, recipientUPI)`: Send money
- `receiveMoney(amount, senderUPI)`: Receive money
- `displayTransactionHistory()`: Show all transactions
- `displayUserInfo()`: Show user profile

### 4. **Driver.java** (`com.phonepe.driver`)
Main application entry point with interactive menu:
- User registration/account creation
- Main menu with options
- Menu handling for all operations
- Input validation and error handling

## Menu Options

```
MAIN MENU - PhonePe
1. View Balance          - Display current wallet balance
2. Add Money to Wallet   - Top up your wallet
3. Send Money            - Transfer to another UPI ID
4. Receive Money         - Receive from another user
5. View Transaction History - See all transactions
6. View Profile          - View your account details
7. Exit                  - Exit the application
```

## Sample Usage

```
Welcome to PHONEPE APP
Enter your name: Gourav
Enter your phone number: 9876543210
Enter your UPI ID (e.g., username@phonepe): gourav@phonepe
✓ Account created successfully!

MAIN MENU - PhonePe
1. View Balance
2. Add Money to Wallet
3. Send Money
4. Receive Money
5. View Transaction History
6. View Profile
7. Exit

Enter your choice (1-7): 2
Enter amount to add (₹): 5000
✓ Added ₹5000.0 to your wallet

Enter your choice (1-7): 1
YOUR WALLET BALANCE
Name: Gourav
UPI ID: gourav@phonepe
Balance: ₹5000.00
```

## Future Enhancements

1. **User Registration & Login**: Persistent user accounts with authentication
2. **Bill Payments**: Pay utility bills, mobile recharges
3. **Merchant Integration**: Buy goods and services
4. **Peer-to-Peer Transfers**: Money transfer between friends
5. **Transaction Filters**: Filter transactions by date range, type, amount
6. **Notifications**: SMS/Email notifications for transactions
7. **Multi-Wallet Support**: Support multiple payment methods
8. **QR Code Payments**: Scan and pay functionality
9. **Transaction Security**: Encryption and secure data storage
10. **Analytics Dashboard**: View spending patterns and statistics

## Error Handling

The application includes comprehensive error handling for:
- Invalid amounts (negative or zero)
- Insufficient balance
- Invalid UPI IDs
- Invalid numeric inputs
- Transaction failures

## Technical Details

- **Language**: Java
- **Package Structure**: `com.phonepe.*`
- **Date/Time Handling**: Java 8+ LocalDateTime
- **Data Structures**: ArrayList for transaction history
- **User Input**: Scanner class for console input

## Author
Kodewala Academy - Object-Oriented Programming Concepts

## License
Educational Purpose Only

---

**Note**: This is a console-based application designed for learning OOP concepts. For production use, add database connectivity, security measures, and GUI improvements.
