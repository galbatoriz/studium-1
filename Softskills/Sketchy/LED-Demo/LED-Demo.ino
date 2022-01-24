// Besonderheiten der FastLED Bibliothek im Zusammenspiel mit ESP8266
#define FASTLED_ALLOW_INTERRUPTS 0
#define FASTLED_ESP8266_RAW_PIN_ORDER

// Bibliothek einbinden
// https://github.com/FastLED/FastLED/wiki/Pixel-reference
#include <FastLED.h>

// DATA_PIN durch Preprocessor setzen
#define DATA_PIN    D5
// Anzahl der LEDs durch Preprocessor setzen
#define NUM_LEDS    8
// LED Array mit NUM_LEDS Elementen
CRGB leds[NUM_LEDS];

boolean effect = false;

void fade() {
  effect = true;
  for(int i = 0; i < NUM_LEDS; i++){
    for (int j = 0; j <= 255; j++){
      leds[i] = CRGB(j,j,j);
      delay(10);
      FastLED.show();
    }
  }
  for(int i = 0; i < NUM_LEDS; i++) {
    for (int l = 255; l >= 0; l--){
      leds[i] = CRGB(l,l,l);
      delay(10);
      FastLED.show();
    }
  }
  effect = false;
}
// Setup Methode
void setup() {
  // 3s warten
  delay(3000);
  //Init
  FastLED.addLeds<WS2812B,DATA_PIN,GRB>(leds, NUM_LEDS).setCorrection(TypicalLEDStrip);
  //Helligkeit auf 50%
  FastLED.setBrightness(50);
  // MAximale Leistung setzen (Spannung und Stromstärke)
  FastLED.setMaxPowerInVoltsAndMilliamps(5,400);
  // LED 1 auf Grün (Funktioniert nicht lol?)
  leds[0] = CRGB(0,255,0);
  // LED 2 auf rot
  leds[1] = CRGB( 255, 0, 0);
  // LED 3 auf rot
  leds[2] = 0xFF0000;
  // LED 4 auf Grün
  leds[3] = CRGB(0,255,0);
  // LED 5 auf Blau
  leds[4] = CRGB(0,0,255);
  // LED 6 auf Weiß
  leds[5] = CRGB::White;
  // Setzen der Farben
  FastLED.show();
  // 3s warten
  delay(3000);
  for (int i = 0; i < NUM_LEDS; i++) {
    leds[i] = CRGB(0,255,255); 
  }
  FastLED.show();
  delay(3000);
  for (int i = 0; i < NUM_LEDS; i++) {
    leds[i] = CRGB(0,0,0); 
  }
  FastLED.show();
  delay(3000);
  // 1. Animation
  fade();
}

// Loop Methode: dieser Code wird in einer Endlosschleife ausgeführt, nachdem setup() ausgeführt wurde
void loop() {
  if (!effect) {
  for (int i = 0; i < NUM_LEDS; i++) {
    leds[i] = CRGB(255,0,0); 
  }
  FastLED.show();
  delay(1000);
  for (int i = 0; i < NUM_LEDS; i++) {
    leds[i] = CRGB(0,0,0); 
  }
  FastLED.show();
  delay(1000);
  }
}
