# Snakes-And-Ladders

This repo contains my first app made in Android Studio. It helped grasp basic understanding of how app works and how to make one using android studio. It's a basic snakes & ladders game with limited functionality based on my knowledge of Android Studio at the time of developing the app. Thus it can be improved further.

### Intro:

I made a simple snakes and ladders game for android. The app has a splash screen which will be displayed for 2 seconds then the main user interface will be shown. The interface will have 2 buttons i.e. Play and Instructions. Instructions button will take you to the instruction screen while play will take you to the actual game. In the game window there is a board at the top of the screen and a button labelled “roll” which will be used to roll the dice and move the players accordingly. The user player is denoted by red box while automated opponent is denoted by a black one. Each dice roll will move the players depending upon the numbers. In the board there are ladders and snakes which will take you forward and backward respectively. First person to finish the 100 mark will win the game and a prompt will be shown. You can see screenshots of the app in the screenshots folder.

### Approach:
I created a button object and images objects for the dice, when the button is pressed the appropriate image will be selected. So, when player pushes the button the dice image is shown and player position is changed.

To change the position of player what I did was, I got X and Y co-ordinates of the current location and set them to the target location for each dice roll.

In case of snakes and ladders I updated the target location accordingly.

As for changing direction when player moves to the upper row i.e. from left --> right to right --> left, I simply multiplied direction with negative 1 to change direction at the end of each row.

Buttons were styled using different xml files and a button disabled was introduced to disable button for 2 seconds after the turn.

Icon and name of the app were also customized.

### How to run:

APK:
* You can download the apk and install the app.

Android Studio:
*  Simply connect a device with your Pc.
* Open project in android studio.
* Run your project and wait for it to build.
* After completion, play the game on the device.

### Future Work/Improvements:
The app currently uses hard coded values for pixels thus it works find on my screen but I can't say the same for every screen. One possible solution is to make player movement relative to the screen instead of absolute so it would work fine on every screen. Another thing that can be added is multiplayer option where you can play with a player instead of AI.
