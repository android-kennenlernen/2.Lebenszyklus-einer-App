2.Lebenszyklus-einer-App
========================

Hier erfolgt eine Beispiel-App bezügliche der Zustände, welche eine App innerhalb ihres Lebenszykluses einnehmen kann.  

Wer schon mal mit sogenannten _Zustands-Maschinen/Statemachines

Die Theorie dahinter findet Ihr hier:  

    http://de.wikipedia.org/wiki/Endlicher_Automat

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

Diese App tut nichts weiter, als in jeder Methode eine Log-Ausgabe zu generieren.  
Wenn Ihr nun mit dem Emulator andere Apps aufruft, zu dieser App wieder zurück kehrt, könnt Ihr im Log-Fenster die Wechsel zwischen den einzelnen Zuständen verfolgen.

__Referenz:__

http://developer.android.com/reference/android/app/Activity.html
