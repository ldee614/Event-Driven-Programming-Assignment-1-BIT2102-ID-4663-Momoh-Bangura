# Java Swing Assignment

## Requirements
- JDK 17 or later
- Visual Studio Code with the Extension Pack for Java (recommended)

## Project structure
- `src/swingassignment.java` — main application source code
- `assets/swing-leaf-icon.png` — original application icon used by `ImageIcon`
- `screenshots/application_screenshot.png` — screenshot captured from the running Swing application
- `screenshots/figma_wireframe.png` and `.svg` — wireframe design; the SVG can be imported into Figma

## Run in VS Code
1. Open this project folder in VS Code.
2. Confirm that a JDK is installed and the Extension Pack for Java is enabled.
3. Open `src/swingassignment.java`.
4. Compile and run the file. The application expects the `assets` folder to be in the project working directory.

From a terminal opened at the project root:
```bash
javac -d out src/swingassignment.java
java -cp out swingassignment
```

## Features
- Window title: Java Swing Assignment
- Window size: 800 × 800 pixels
- Close operation: exits the application
- Custom icon loaded with `ImageIcon`
- Button to change the welcome label
- Button to cycle the panel background through four colours

The class `swingassignment` extends `JFrame`, demonstrating inheritance. Its constructor configures the frame and creates the interface.
