###Test de cadenes buides

### 1. Quan es passa una cadena buida, el resultat hauria de ser true.
- Entrada: ""
- Resultado esperado: true


### 2. Al passar la cadena "[test]", el resultat hauria de ser true.
 - Entrada: "[test]"
 - Resultado esperado: true

### 3. Al passar la cadena "[]", el resultat hauria de ser true.
- Entrada: "[]"
- Resultado esperado: true


### 4.Al passar la cadena "[[test]]", el resultat hauria de ser true.
- Entrada: "[[test]]"
- Resultado esperado: true

### 5. Al passar la cadena "[test[", el resultat hauria de ser false.
- Entrada: "[test["
- Resultado esperado: false

### 6.Al passar la cadena "[test", el resultat hauria de ser false.
Entrada: "[test"
Resultado esperado: false

### 7.Al passar la cadena "test]", el resultat hauria de ser false.
- Entrada: "test]"
- Resultado esperado: false

### 8.Al passar la cadena "a[test]b", el resultat hauria de ser true.
- Entrada: "a[test]b"
- Resultado esperado: true

### 9.Al passar la cadena "[a[b]c]d", el resultat hauria de ser true.
- Entrada: "[a[b]c]d"
- Resultado esperado: true

### 10.Al passar la cadena "[a[b]c[d]", el resultat hauria de ser false.
- Entrada: "[a[b]c[d]"
- Resultado esperado: false

### 11.Al passar la cadena "a[b]c[d]e", el resultat hauria de ser true.
- Entrada: "a[b]c[d]e"
- Resultado esperado: true

### 12.Al passar la cadena "[[[test]]]", el resultat hauria de ser true.
- Entrada: "[[[test]]]"
- Resultado esperado: true