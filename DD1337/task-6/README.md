# Övning 6 - 

### **Vad pratade vi om förra veckan?**
* Kodkvalitet
* Arrays vs. `ArrayList`
* Strängar = listor

### **Deep vs. shallow copy**
Ta några minuter och diskutera som ni sitter:
* Vad är skillnaden egentligen?

### **Vi går igenom `task-6`**
* Hur har det gått? 😎😀🙂😐😟🤬💀
* Diskussion
* Redovisning

---

### **Gissa spelet**

**Bakgrund**

Denna veckas uppgift introducerar koncepten *användarinput* och *spelloopar*. Genom att interagera med användaren kan vi skapa dynamiska program som reagerar på användarens beslut. En spelloop tillåter programmet att köra upprepade gånger tills ett specifikt villkor är uppfyllt.

Den här veckan är det [parprogrammering](https://sv.wikipedia.org/wiki/Parprogrammering) som gäller, så ni ska jobba i par där en kodar och en vägleder.

**Förberedelse**

Innan ni börjar med huvuduppgiften, ta en titt på `UserInputDemo.java` och `SimpleGameLoopDemo.java` för att förstå grunderna om användarinput och spelloopar.

- I [`UserInputDemo.java`](./UserInputDemo.java) lär ni er hur man kan ta emot och använda information från användaren.
- I [`SimpleGameLoopDemo.java`](./SimpleGameLoopDemo.java) introduceras ni till idén om en loop där ett program fortsätter tills användaren har uppnått ett visst mål.

**Uppgift**

Efter att ha förstått ovanstående demos, är det dags att skapa ett "Gissa talet"-spel. Spelet kommer att slumpmässigt välja ett tal mellan 1 och 100. Användarens mål är att gissa vilket tal det är. Efter varje gissning kommer spelet att berätta om det korrekta talet är högre, lägre eller om användaren har gissat rätt.

- Skapa en klass `GuessingGame.java`.
- Inom denna klass, använd `java.util.Random` för att generera ett slumpmässigt tal mellan 1 och 100.
- Använd en `while`-loop för att hålla spelet igång tills användaren har gissat rätt.
- Efter varje gissning, ge feedback till användaren om de borde gissa högre, lägre, eller om de har gissat rätt.

Exempel på en körning av spelet:

```bash
javac GuessingGame.java
java GuessingGame
Gissa ett tal mellan 1 och 100: 50
Gissa högre!
Gissa ett tal mellan 1 och 100: 75
Gissa lägre!
Gissa ett tal mellan 1 och 100: 63
Grattis! Du gissade rätt!
```

---

**Om ni får tid över:** Lägg till en räknare som håller reda på hur många försök användaren behövde för att gissa rätt. Visa antalet försök när spelet är över.

---

**Överkurs:** Utveckla spelet så att det innehåller flera svårighetsgrader (t.ex. 1-10, 1-50, 1-100). Låt användaren välja svårighetsgrad i början av spelet.