# Java Spring 1 - Realizacja Zadania

## Wprowadzenie
Ta aplikacja jest realizacją zadania 1 z Frameworka Spring
z przedmiotu programowanie Java.

## Pliki i ich działanie
### **JavaSpring1Application**
Klasa główna aplikacji inicjująca jej działanie

### **HelloController.java**
Zawarty jest tu kontroler obsługujący żadania HTTP. Znajdziemy tu też dwa Endpointy:

 - **@GetMapping("/")**: Wyświetla stronę ze stałym komunikatem
 - **@GetMapping("/greeting")**: Wyświetla dynamiczny komunikat używając template'u strony

### **greeting.html**
To jest nasz wcześniej wspomniany template. Nie licząc wiadomości powitalnej zobaczymy tu jeszcze obrazek oraz krótki tekst.

### **index.html**
To template na naszą statyczną stronę

## Działanie aplikacji
### Przykład 1 - Strona główna
Po uruchomieniu programu przechodzimy w przeglądarce na **localhost:8080/** i otrzymujemy komunikat "Hello Vistula..."

### Przykład 2 - Dynamiczne przywitanie
Powtarzamy kroki z przykładu 1 z tą różnicą że tym razem wchodzimy na **localhost:8080/greeting** i mamy dwie możliwości. Zostawimy tak jak jest, wtedy na stronie dostaniemy wiadomość Hello World, lub po /greeting dodać **?name=twojeimie**, to zwróci nam przywitanie na podaną wartość twojeimie.