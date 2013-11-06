2.Lebenszyklus-einer-App
========================

Hier erfolgt eine Beispiel-App bezügliche der Zustände, welche eine App innerhalb ihres Lebenszykluses einnehmen kann.

'''java
public class Activity extends ApplicationContext {
     protected void onCreate(Bundle savedInstanceState);

     protected void onStart();
     
     protected void onRestart();

     protected void onResume();

     protected void onPause();

     protected void onStop();

     protected void onDestroy();
}
'''

__Referenz:__

http://developer.android.com/reference/android/app/Activity.html
