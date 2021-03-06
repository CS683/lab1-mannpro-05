# CS683 Lab1 Report

### Mann Prajapati | U52609954

## The Github link 

[https://github.com/CS683/lab1-mannpro-05](https://github.com/CS683/lab1-mannpro-05)

## Set up Android Studio and git/Github.

I have been using android studio for a long time so I didn't have any problem setting it up. I've also had experience with git and Github so I already had it installed in my system. I've also used Github in the Android Studio so I was able to commit and push the code without having any problems. 

## Activity Lifecycle Summary.


| Actions                                       | Callback functions called in order.      |
|-----------------------------------------------|------------------------------------------|
| Open the app                                  | onCreate() -> onResume().                |
| App going into background(Pressing home button) | onPause() -> onStop().                   |
| App coming in foreground                      | onRestart() -> onCreate() -> onResume(). |
| Rotating the screen| onPause() -> onStop() -> onDestroy() -> onCreate() -> onResume(). |
| Changing app. | onPause() -> onStop().                   |
| Pressing back button.                         | onPause() -> onStop() -> onDestroy().    |
| Closing the app.                              | onPause() -> onStop() -> onDestroy().    |


# Screenshots




### Application Opeaned.
![image](https://drive.google.com/uc?export=view&id=16AK_fhb8mx1QHYGhQL92dzLPGGX7Wvb8)
### Application running in background(Home button pressed.)
![image](https://drive.google.com/uc?export=view&id=1cWU0pviS57cVgIMEkB12y_XMIFxrlMwI)
### Application coming into foreground.
![image](https://drive.google.com/uc?export=view&id=1rNQhjNj9gV11SzVG2pjJlGpCgE_80kKd)
### Rotating the screen
![image](https://drive.google.com/uc?export=view&id=1kFBSmWkTVJ7peaCuEvy-fW8KjQog2cSi)
### Back button pressed.
![image](https://drive.google.com/uc?export=view&id=12iWNB9611aTztZoBVltcO1bRtqrHZLYn)
### Changing app
![image](https://drive.google.com/uc?export=view&id=1SVoiWLJ4qn15Q7v04oZXCQYwZ-zjf9Td)
### Application Closed.
![image](https://drive.google.com/uc?export=view&id=1dQj3HEPuviAQimGmaacd7B7iB5qn_8yA)