# Bored API Automation

## Overview
This repository contains an API automation script for interacting with the [Bored API](https://www.boredapi.com/api/activity). The Bored API provides random activity suggestions for individuals who are feeling bored. The automation script makes API requests and handles responses to ensure the provided functionality is working as expected.

## Task Details
The primary objective of this task is to automate interactions with the Bored API, making API requests and handling responses.

### Key Features
1. **Endpoint:** The API endpoint used for this task is [https://www.boredapi.com/api/activity](https://www.boredapi.com/api/activity).
2. **Response Sample:**
    ```json
    {
        "activity": "Teach your dog a new trick",
        "type": "relaxation",
        "participants": 1,
        "price": 0.05,
        "link": "",
        "key": "1668223",
        "accessibility": 0.15
    }
    ```

## Getting Started
To get started with this project, follow these steps:

1. **Clone the Repository:**
    ```bash
    git clone <repository-url>
    cd <repository-folder>
    ```

2. **Install Dependencies:**
    ```bash
    # Assuming you have Python installed
    pip install -r requirements.txt
    ```

3. **Run the Automation Script:**
    ```bash
    python api_automation_script.py
    ```

## Automation Script
The `api_automation_script.py` file in this repository contains the automation script responsible for making API requests to the Bored API and processing the responses.

## Contributions
Contributions to this project are welcome! If you find any issues or have suggestions for improvements, please open an issue or create a pull request.
