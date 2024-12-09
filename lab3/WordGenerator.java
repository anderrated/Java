package lab3;

public class WordGenerator {
   private static String[] words = new String[]{"abstract", "arguement", "array", "ascii", "binary", "operator", "boolean", "block", "break", "byte", "case", "casting", "char", "class", "comment", "compiler", "compilation", "constructor", "double", "else", "exception", "field", "final", "float", "for", "hexadecimal", "import", "instance", "int", "interpreter", "java", "keyword", "literal", "member", "method", "new", "object", "overloading", "overriding", "package", "private", "protected", "public", "reference", "return", "scope", "short", "static", "switch", "variable", "void"};

   public WordGenerator() {
   }

   private static int getRandomIndex() {
      return (int)(Math.random() * (double)words.length - 1.0);
   }

   public static String generateWord() {
      int var0 = getRandomIndex();
      return words[var0];
   }
}
