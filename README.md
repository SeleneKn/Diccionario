# Mini Diccionario Interactivo Español-Inglés 🇪🇸🇬🇧

## Descripción
Este proyecto es una aplicación de consola desarrollada en Java que funciona como un mini quiz interactivo. El programa almacena un diccionario de más de 40 palabras en español con sus respectivas traducciones al inglés, selecciona 5 palabras al azar y pone a prueba los conocimientos del usuario.

## Características y Funcionalidades
- **Diccionario integrado:** Utiliza un `HashMap` para almacenar más de 40 pares de palabras (Español-Inglés).
- **Selección aleatoria:** Utiliza `Collections.shuffle()` para seleccionar 5 preguntas distintas cada vez que se inicia el programa.
- **Validación de respuestas:** Ignora mayúsculas y minúsculas al momento de evaluar la respuesta del usuario (ej. "House" y "house" son válidas).
- **Conteo de resultados:** Lleva un registro de los aciertos y errores para mostrar un resumen al finalizar el cuestionario.

## 🛠 Tecnologías utilizadas
- **Java** (JDK 17 o superior)
- **IntelliJ IDEA** (Entorno de desarrollo)
- **Programación Orientada a Objetos** (Interfaces, Clases, Encapsulamiento)
- **Java Collections Framework** (`HashMap`, `ArrayList`, `Map`, `List`)

## 📁 Estructura del proyecto

```text
src/
└── TranslatorQuizApp.java    (Clase principal con el método main)
└── ejercicio/traductor/
    ├── TranslationProvider.java  (Interfaz que define el contrato del diccionario)
    ├── WordRepository.java       (Implementación del diccionario y las palabras)
    ├── QuizEngine.java           (Lógica del juego, preguntas y puntuación)
    
```

## 🚀 Cómo ejecutar el proyecto
1. Clona este repositorio o descarga los archivos en tu computadora.
2. Abre el proyecto utilizando **IntelliJ IDEA**.
3. Asegúrate de que el SDK de Java esté configurado correctamente en el proyecto.
4. Dirígete a la clase `TranslatorQuizApp.java` (ubicada en `src/ejercicio/traductor/`).
5. Haz clic derecho sobre el archivo y selecciona **"Run 'TranslatorQuizApp.main()'"** (o presiona `Shift + F10`).

## 💻 Ejemplo de ejecución

```text
¿Cómo se dice "montaña" en inglés? mountain
¡Correcto!

¿Cómo se dice "ventana" en inglés? Windw
Incorrecto. La traducción correcta es: window

¿Cómo se dice "amigo" en inglés? friend
¡Correcto!

¿Cómo se dice "dinero" en inglés? money
¡Correcto!

¿Cómo se dice "playa" en inglés? beach
¡Correcto!

--- Resultados ---
Aciertos: 4
Errores: 1
```

---
*Proyecto desarrollado como práctica de lógica de programación y estructuras de datos en Java.*
```