2.Lebenszyklus-einer-App
========================

Hier erfolgt eine Beispiel-App bezügliche der Zustände, welche eine App innerhalb ihres Lebenszykluses einnehmen kann.  

Wer schon einmal mit den sogenannten [Zustands-Maschinen/state machines](http://de.wikipedia.org/wiki/Endlicher_Automat) zu tun hatte, wird diese in der Referenz unschwer wieder erkennen.

Im Falle einer Android-App ist dies so umgesetzt:

```java
public class Activity extends ApplicationContext {
    protected void onCreate(Bundle savedInstanceState);

    protected void onStart();
     
    protected void onRestart();

    protected void onResume();

    protected void onPause();

    protected void onStop();

    protected void onDestroy();
}
```

Diese App tut letztendlich nichts weiter, als für jede Methode/jeden Status eine Log-Ausgabe zu generieren.  
Wenn Ihr nun im Emulator andere Apps aufruft, zu _dieser_ App wieder zurück kehrt, könnt Ihr im Log-Fenster die Wechsel zwischen den einzelnen Zuständen verfolgen.

__Referenz:__

http://developer.android.com/reference/android/app/Activity.html
