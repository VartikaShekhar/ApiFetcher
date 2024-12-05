# Fetch Rewards Coding Exercise - Mobile Application
This is a native Android application written in Kotlin for the Fetch Rewards Coding Exercise. The app fetches data from an API, processes it, and displays the results in an organized and user-friendly manner. The main features include:
- Grouping items by `listId`.
- Sorting items first by `listId` and then by `name`.
- Filtering out any items with blank or null `name`.
- Displaying the results in a clean, responsive `RecyclerView`.

 ### How to Build and Run the App:
1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/yourusername/ApiFetcher.git
- Open the project in Android Studio (latest stable version recommended).
- Run the app on an emulator or physical device:
- Ensure the device/emulator runs Android 15 (API level 35) or higher.

### Tools and Dependencies:
- **Language:** Kotlin
- **Libraries:**
  - [Retrofit](https://square.github.io/retrofit/) for API calls.
  - [Gson](https://github.com/google/gson) for JSON parsing.
  - [RecyclerView](https://developer.android.com/jetpack/androidx/releases/recyclerview) for displaying data.

- **Supported SDKs:**
  - **Target SDK:** 35 (Android 15)
  - **Compile SDK:** 35



