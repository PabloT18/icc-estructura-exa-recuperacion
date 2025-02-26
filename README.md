
# **Gestión y Búsqueda de Personas**  



Se requiere implementar un programa para gestionar una lista de personas, organizándolas y clasificándolas según diferentes criterios. Para ello, se trabajará con una clase `Persona`, que contendrá los siguientes atributos:  

- **Nombre**   
- **Apellido**   
- **Edad**  

El programa deberá realizar operaciones de **ordenamiento, búsqueda, clasificación y almacenamiento**, asegurando la correcta elección de estructuras de datos para cada tarea.  

---

### **1. Ordenamiento**  
Implementa un método de ordenamiento (**Burbuja, QuickSort, MergeSort, SelectionSort, etc.**) que ordene una lista de personas **alfabéticamente por apellido**.  
- **Restricción:** No se permite el uso de `.sort()` ni de métodos predeterminados de Java para ordenamiento.  
- **Requerimiento:** El método debe recibir la lista de personas desde el `main` y devolverla ordenada.  
- En caso de que dos personas tengan el mismo apellido, se debe ordenar por **nombre**.  

**Firma esperada del método:**  
```java
public List<Persona> ordenarPorApellido(List<Persona> personas) 
```

---

### **2. Búsqueda Binaria**  
Implementa un método que busque una persona en la lista según su **edad** utilizando **búsqueda binaria**.  
- **Requerimiento:**  
  - El método debe recibir la **lista previamente ordenada** y la edad a buscar. 
  - Si hay varias personas con la misma edad, devuelve la **primera coincidencia**.  
  - Si no se encuentra ninguna persona con la edad dada, se debe indicar adecuadamente.  

**Firma esperada del método:**  
```java
public  Persona buscarPorEdad(List<Persona> personas, int edad) 
```

---

### **3. Clasificación por Categoría de Edad**  
Implementa un método que clasifique a las personas en tres categorías según su edad:  
- **"Menores de edad"** (menores de 18 años)  
- **"Adultos"** (de 18 hasta 60 años)  
- **"Tercera edad"** (mayores de 60 años)  

Para almacenar la clasificación, utiliza un **Map** donde:  
- La **clave** sea la categoría (`String`).  
- El **valor** sea una lista de personas (`List<Persona>`) que pertenecen a dicha categoría.  
- **Debe asegurarse que el `Map` mantenga el orden de la lista previamente ordenada**.  

**Firma esperada del método:**  
```java
public  Map<String, List<Persona>> clasificarPorEdad(List<Persona> personas) 
```

---

### **4. Elección de Implementación de Set**  
Implementa un método que permita elegir una estructura de datos tipo **Set** (`LinkedHashSet`, `TreeSet` o `HashSet`) para almacenar una categoría específica, para no tener Personas duplicadas.   
- **Requerimiento:**  
  - El método recibirá como parámetros la categoría deseada (Ejemplo: `"Adultos"`) y el `Map` generado en la clasificación previa.  
  - Se debe seleccionar la mejor implementación de **Set**, justificando su elección según las propiedades de la estructura de datos utilizada.  

**Firma esperada del método:**  
```java
public  Set<Persona> elegirImplementacionSet(String categoria, Map<String, List<Persona>> clasificacion) 
```

---

### **Salida esperada del programa**  

Para demostrar el correcto funcionamiento del programa, se deben ejecutar los métodos implementados en el `main` y mostrar la salida esperada.  

Ejemplo de salida esperada tras ejecutar los métodos en orden, no es como debe salir es solo un ejemplo de la salida esperada.

Para el punto **4**, se debe probar el método enviando la categoría **"Adultos"** como parámetro.  

```
Lista antes de ordenar:
Carlos Gomez (25)
Ana Martinez (30)
Luis Gomez (22)
Beatriz Alvarez (28)
David Martinez (40)
...

Lista después de ordenar:
Beatriz Alvarez (28)
Carlos Gomez (25)
Luis Gomez (22)
Ana Martinez (30)
David Martinez (40)
...

Búsqueda de persona con edad 22:
Luis Gomez (22)

Clasificación por edad:
Menores de edad: []
Adultos: [Carlos Gomez (25), David Martinez (40), Luis Gomez (22), Ana Martinez (30), David Martinez (40), ...]
Tercera edad: []

Implementación de Set para categoría "Adultos":
LinkedHashSet utilizado para preservar el orden
TreeSet utilizado para preservar el orden
HashSet utilizado para preservar el orden

Impresión de Set: 
Carlos Gomez (25), Luis Gomez (22), Ana Martinez (30), David Martinez (40), ...
```



| **Criterio**                           | **Puntaje Máximo** | **Descripción** |
|-----------------------------------------|--------------------|----------------|
| PARTE TEORICA  | **10 pts**         | Preguntas en el AVAC |
| **1. Implementación del Ordenamiento**  | **10 pts**         | Implementa un algoritmo de ordenamiento que ordene la lista de personas **por apellido**. **No se permite usar `.sort()` ni métodos predeterminados de Java**. |
| **2. Implementación de la Búsqueda Binaria** | **8 pts**  | Implementa **búsqueda binaria** sobre la lista previamente ordenada para encontrar una persona según su edad. Debe devolver la primera coincidencia y manejar correctamente el caso cuando la persona no es encontrada. |
| **3. Implementación de la Clasificación por Edad** | **10 pts** | Clasifica correctamente a las personas en tres categorías: **"Menores de edad" (<18), "Adultos" (18-60), "Tercera edad" (>60)**, utilizando un `Map` que preserve el orden de la lista previamente ordenada. |
| **4. Implementación de la Elección del `Set`** | **8 pts** | Implementa un método que permite seleccionar una estructura de datos `Set` (`LinkedHashSet`, `TreeSet` o `HashSet`) para almacenar una categoría específica, justificando la elección y utilizando correctamente el `Map` de clasificación. |
| **5. Funcionamiento General del Programa** | **4 pts** | El código compila y se ejecuta sin errores, mostrando la **salida esperada** correctamente. |

**Total: 50 pts** ✅  

