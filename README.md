SomaInteiros (Exercício 1 — Eclipse + GitHub)
Pequeno programa em Java que soma dois números inteiros lidos pelo teclado.

Como executar no Eclipse
File ▸ New ▸ Java Project → Nome: SomaInteiros → Finish.
Clique direito no projeto → New ▸ Source Folder → src.
Clique direito em src → New ▸ Package → ex1.
Clique direito em ex1 → New ▸ Class → SomaDoisNumeros (marque public static void main).
Copie o conteúdo de src/ex1/SomaDoisNumeros.java deste repo.
Right-click no arquivo → Run As ▸ Java Application.
Execução via linha de comando (opcional)
javac -d out src/ex1/SomaDoisNumeros.java
java -cp out ex1.SomaDoisNumeros
Git — comandos usados
git init
git add .
git commit -m "Ex1: projeto SomaInteiros com SomaDoisNumeros.java"
git branch -M main
git remote add origin https://github.com/<SEU_USUARIO>/<SEU_REPO>.git
git push -u origin main
Estrutura
SomaInteiros/
  └─ src/
     └─ ex1/
        └─ SomaDoisNumeros.java
Licença
MIT
