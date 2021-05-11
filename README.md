# Snakes-And-Ladders

This repo contains my first app made in Android Studio. It helped grasp basic understanding of how app works and how to make one using android studio. Its a basic snakes & ladders game which can be improved further but since I didn't know much about android studio when I was making it So you might run into some issues. You can find more details about the app here: wahabaftab.com/Projects


### Approach:
I created a button object and images objects for the dice, when the button is pressed the appropriate image will be selected. So, when player pushes the button the dice image is shown and player position is changed, to change the position of player what I did was, I got X and Y co-ordinates of the current location and set them to the target location for each dice roll. In case of snakes and ladders I updated the target location accordingly. As for changing direction when player moves to the upper row i.e. from leftright to right left, I simply multiplied direction with negative 1 to change direction at the end of each row.
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
