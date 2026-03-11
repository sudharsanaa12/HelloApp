// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.HashMap;
import java.util.Map;

public class BannerAppUC8 {
   static Map<Character, String[]> patternMap = new HashMap();

   public BannerAppUC8() {
   }

   public static void main(String[] var0) {
      loadPatterns();
      String var1 = "OOPS";
      renderBanner(var1);
   }

   static void loadPatterns() {
      patternMap.put('O', new String[]{" *** ", "*   *", "*   *", "*   *", " *** "});
      patternMap.put('P', new String[]{"**** ", "*   *", "**** ", "*    ", "*    "});
      patternMap.put('S', new String[]{" ****", "*    ", " *** ", "    *", "**** "});
   }

   static void renderBanner(String var0) {
      byte var1 = 5;

      for(int var2 = 0; var2 < var1; ++var2) {
         for(int var3 = 0; var3 < var0.length(); ++var3) {
            char var4 = var0.charAt(var3);
            String[] var5 = (String[])patternMap.get(var4);
            if (var5 != null) {
               System.out.print(var5[var2] + "  ");
            }
         }

         System.out.println();
      }

   }
}
