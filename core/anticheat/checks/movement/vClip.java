package core.anticheat.checks.movement;

import core.anticheat.checks.CheckResult;
import core.anticheat.checks.CheckType;
import core.anticheat.util.Distance;
import core.anticheat.util.Settings;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;

public class vClip {
  private static int lIIIlII(double paramDouble1, double paramDouble2) {
    return paramDouble1 cmp paramDouble2;
  }
  
  private static boolean lIIlIll(String lllllIlIlIIIIlI) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 < null);
  }
  
  public static CheckResult runCheck(long lllllIlIllIlIlI, short lllllIlIllIlIII) {
    Location lllllIlIlllIIII = lllllIlIlllIIIl.getFrom().clone();
    Location lllllIlIllIllll = lllllIlIlllIIIl.getTo().clone();
    if (lIIIlIl(lllllIlIllIlIlI.getPlayer().isOp()))
      return PASS; 
    if (lIIIlIl(lllllIlIllIlIlI.getPlayer().hasPermission(String.valueOf((new StringBuilder(String.valueOf(Settings.NAME))).append(lllIl[lIIllI[1]])))))
      return PASS; 
    if (lIIIlIl(lllllIlIllIlIlI.getPlayer().isFlying()))
      return PASS; 
    if (!lIIIlll(lllllIlIllIlIlI.getPlayer().getGameMode(), GameMode.CREATIVE) || lIIlIII(lllllIlIllIlIlI.getPlayer().getGameMode(), GameMode.SPECTATOR))
      return PASS; 
    double lllllIlIllIlllI = lllllIlIllIllll.getY() - lllllIlIlllIIII.getY();
    if (!lIIlIIl(lIIIIll(lllllIlIllIlllI, -0.9D)) || lIIlIlI(lIIIlII(lllllIlIllIlllI, 0.9D))) {
      int lllllIlIllIllIl = (int)Math.round(Math.abs(lllllIlIllIlllI));
      int lllllIlIllIllII = lIIllI[0];
      "".length();
      if (-" ".length() == ((0xB7 ^ 0x93 ^ 0x28 ^ 0x3) & (88 + 11 - 45 + 84 ^ 38 + 2 - -15 + 78 ^ -" ".length())))
        return null; 
      while (!lIIllIl(lllllIlIllIllII, lllllIlIllIllIl)) {
        if (lIIlIll(lIIIIll(lllllIlIllIlllI, -0.9D))) {
          "".length();
          if (-"  ".length() >= 0)
            return null; 
        } else {
        
        } 
        Location lllllIlIllIlIll = lllllIlIlllIIII.clone().add(0.0D, lllllIlIllIllII, 0.0D);
        if (lIIllII(lllllIlIllIlIll.getBlock()) && lIIIlIl(lllllIlIllIlIll.getBlock().getType().isSolid()) && lIIIlIl(lllllIlIllIlIll.getBlock().getType().isBlock()) && lIIIlll(lllllIlIllIlIll.getBlock().getType(), Material.AIR) && lIIIlIl(Settings.blocked.contains(lllllIlIllIlIll.getBlock().getType())))
          return new CheckResult(lIIllI[1], CheckType.VCLIP, lllIl[lIIllI[2]]); 
        lllllIlIllIllII++;
      } 
    } 
    return PASS;
  }
  
  private static boolean lIIIlll(byte lllllIlIlIIllll, long lllllIlIlIIlllI) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 != SYNTHETIC_LOCAL_VARIABLE_1);
  }
  
  private static void llIIlI() {
    lllIl = new String[lIIllI[3]];
    lllIl[lIIllI[0]] = lIIllI("2ZIzzcMsI3k=", "xqNnq");
    lllIl[lIIllI[1]] = lIIllI("PScJuNxluh4=", "HlntO");
    lllIl[lIIllI[2]] = lIIllI("sWdQ04GlYr0=", "MOyrk");
  }
  
  private static boolean lIIllII(float lllllIlIlIIlIII) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 != null);
  }
  
  private static boolean lIIlIlI(short lllllIlIlIIIIII) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 > null);
  }
  
  private static void lIIIIlI() {
    lIIllI = new int[5];
    lIIllI[0] = (0x31 ^ 0x2F ^ 0xF6 ^ 0xB3) & (220 + 107 - 313 + 235 ^ 146 + 94 - 137 + 59 ^ -" ".length());
    lIIllI[1] = " ".length();
    lIIllI[2] = "  ".length();
    lIIllI[3] = "   ".length();
    lIIllI[4] = 0xB2 ^ 0xBA;
  }
  
  private static boolean lIIlIII(short lllllIlIlIIlIll, char lllllIlIlIIlIlI) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 == SYNTHETIC_LOCAL_VARIABLE_1);
  }
  
  private static boolean lIIlIIl(long lllllIlIlIIIlII) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 >= null);
  }
  
  private static boolean lIIIlIl(double lllllIlIlIIIllI) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 != null);
  }
  
  private static String lIIllI(String lllllIlIlIllIll, String lllllIlIlIllIlI) {
    try {
      SecretKeySpec lllllIlIlIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIlIlIllIlI.getBytes(StandardCharsets.UTF_8)), lIIllI[4]), "DES");
      Cipher lllllIlIlIlllIl = Cipher.getInstance("DES");
      lllllIlIlIlllIl.init(lIIllI[2], lllllIlIlIllllI);
      return new String(lllllIlIlIlllIl.doFinal(Base64.getDecoder().decode(lllllIlIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
    } catch (Exception lllllIlIlIlllII) {
      lllllIlIlIlllII.printStackTrace();
      return null;
    } 
  }
  
  private static boolean lIIllIl(boolean lllllIlIlIlIIll, char lllllIlIlIlIIlI) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 >= SYNTHETIC_LOCAL_VARIABLE_1);
  }
  
  private static int lIIIIll(double paramDouble1, double paramDouble2) {
    return paramDouble1 cmp paramDouble2;
  }
  
  static {
    lIIIIlI();
    llIIlI();
  }
}


/* Location:              C:\Users\J\Desktop\AVM.jar!\core\anticheat\checks\movement\vClip.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */