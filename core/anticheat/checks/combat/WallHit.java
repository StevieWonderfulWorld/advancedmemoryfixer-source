package core.anticheat.checks.combat;

import core.anticheat.checks.CheckResult;
import core.anticheat.checks.CheckType;
import core.anticheat.util.Distance;
import core.anticheat.util.Settings;
import core.anticheat.util.User;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class WallHit {
  private static boolean llIIlll(int lllllIIIlIlIIIl) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 <= null);
  }
  
  private static void llIIIII() {
    lIllIl = new int[5];
    lIllIl[0] = (0x4A ^ 0x59 ^ " ".length()) & (186 + 83 - 249 + 191 ^ 156 + 153 - 194 + 78 ^ -" ".length());
    lIllIl[1] = " ".length();
    lIllIl[2] = "  ".length();
    lIllIl[3] = "   ".length();
    lIllIl[4] = 0x6F ^ 0x6B;
  }
  
  private static void lIlIIIl() {
    lIIIlI = new String[lIllIl[4]];
    lIIIlI[lIllIl[0]] = lllIIl("/YSTeaC1FUI=", "ueNib");
    lIIIlI[lIllIl[1]] = lllIIl("0u1bM/cF+cM=", "LcZdX");
    lIIIlI[lIllIl[2]] = lllIIl("Mpo0hjyhTeIKjxbMVWitHk8Trt9cs8vgi29GDCNGT6k=", "ZEDYk");
    lIIIlI[lIllIl[3]] = lllIIl("ohpMi1vQzjE=", "zzxtL");
  }
  
  private static boolean llIIlIl(float lllllIIIlIlIlIl) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 == null);
  }
  
  private static boolean llIlIIl(long lllllIIIlIllIIl) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 != null);
  }
  
  private static int llIIIIl(double paramDouble1, double paramDouble2) {
    return paramDouble1 cmp paramDouble2;
  }
  
  public static CheckResult runCheck(User lllllIIIlllIlll, boolean lllllIIIllIlllI) {
    Distance lllllIIIlllIlIl = new Distance(lllllIIIlllIlll.getPlayer().getLocation(), lllllIIIllIlllI.getLocation());
    double lllllIIIlllIlII = lllllIIIlllIlIl.getXDifference();
    double lllllIIIlllIIll = lllllIIIlllIlIl.getZDifference();
    Player lllllIIIlllIIlI = lllllIIIlllIlll.getPlayer();
    if (llIIlII(lllllIIIlllIlll.getPlayer().isOp()))
      return PASS; 
    if (llIIlII(lllllIIIlllIlll.getPlayer().hasPermission(String.valueOf((new StringBuilder(String.valueOf(Settings.NAME))).append(lIIIlI[lIllIl[1]])))))
      return PASS; 
    if (!llIIlII(llIIIIl(lllllIIIlllIlII, 0.0D)) || llIIlIl(llIIIIl(lllllIIIlllIIll, 0.0D))) {
      System.out.println(lIIIlI[lIllIl[2]]);
      return PASS;
    } 
    if (llIIllI(llIIIIl(lllllIIIlllIlIl.getYDifference(), 0.6D)))
      return PASS; 
    Location lllllIIIlllIIIl = null;
    if (llIIlll(llIIIlI(lllllIIIlllIlII, 0.5D)) && llIIllI(llIIIIl(lllllIIIlllIIll, 1.0D))) {
      if (llIlIII(llIIIIl(lllllIIIlllIIlI.getLocation().getZ(), lllllIIIllIlllI.getLocation().getZ()))) {
        lllllIIIlllIIIl = lllllIIIlllIIlI.getLocation().clone().add(0.0D, 0.0D, -1.0D);
        "".length();
        if ((0x6D ^ 0x1A ^ 0x15 ^ 0x67) <= 0)
          return null; 
      } else {
        lllllIIIlllIIIl = lllllIIIlllIIlI.getLocation().clone().add(0.0D, 0.0D, 1.0D);
        "".length();
        if (((0x3A ^ 0x78) & (0x5A ^ 0x18 ^ 0xFFFFFFFF)) != 0)
          return null; 
      } 
    } else if (llIIlll(llIIIlI(lllllIIIlllIIll, 0.5D)) && llIIllI(llIIIIl(lllllIIIlllIlII, 1.0D))) {
      if (llIlIII(llIIIIl(lllllIIIlllIIlI.getLocation().getX(), lllllIIIllIlllI.getLocation().getX()))) {
        lllllIIIlllIIIl = lllllIIIlllIIlI.getLocation().clone().add(-1.0D, 0.0D, 0.0D);
        "".length();
        if (-"  ".length() >= 0)
          return null; 
      } else {
        lllllIIIlllIIIl = lllllIIIlllIIlI.getLocation().clone().add(-1.0D, 0.0D, 0.0D);
      } 
    } 
    int i = lIllIl[0];
    if (llIlIIl(lllllIIIlllIIIl)) {
      if (llIIlII(lllllIIIlllIIIl.getBlock().getType().isSolid()) && llIIlII(lllllIIIlllIIIl.clone().add(0.0D, 1.0D, 0.0D).getBlock().getType().isSolid())) {
        "".length();
        if ("  ".length() == -" ".length())
          return null; 
      } else {
      
      } 
      i = lIllIl[0];
    } 
    if (llIIlII(i)) {
      "".length();
      if ("   ".length() < " ".length())
        return null; 
    } else {
    
    } 
    return PASS;
  }
  
  private static int llIIIlI(double paramDouble1, double paramDouble2) {
    return paramDouble1 cmp paramDouble2;
  }
  
  private static boolean llIIllI(Exception lllllIIIlIlIIll) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 >= null);
  }
  
  private static boolean llIlIII(Exception lllllIIIlIIllll) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 > null);
  }
  
  private static String lllIIl(char lllllIIIlIllllI, String lllllIIIlIlllll) {
    // Byte code:
    //   0: new javax/crypto/spec/SecretKeySpec
    //   3: dup
    //   4: ldc 'MD5'
    //   6: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/MessageDigest;
    //   9: aload_1
    //   10: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   13: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   16: invokevirtual digest : ([B)[B
    //   19: ldc_w 'Blowfish'
    //   22: invokespecial <init> : ([BLjava/lang/String;)V
    //   25: astore_2
    //   26: ldc_w 'Blowfish'
    //   29: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   32: astore_3
    //   33: aload_3
    //   34: getstatic core/anticheat/checks/combat/WallHit.lIllIl : [I
    //   37: iconst_2
    //   38: iaload
    //   39: aload_2
    //   40: invokevirtual init : (ILjava/security/Key;)V
    //   43: new java/lang/String
    //   46: dup
    //   47: aload_3
    //   48: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   51: aload_0
    //   52: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   55: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   58: invokevirtual decode : ([B)[B
    //   61: invokevirtual doFinal : ([B)[B
    //   64: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   67: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   70: areturn
    //   71: astore_2
    //   72: aload_2
    //   73: invokevirtual printStackTrace : ()V
    //   76: aconst_null
    //   77: areturn
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	78	0	lllllIIIllIIIII	Ljava/lang/String;
    //   0	78	1	lllllIIIlIlllIl	S
    //   0	78	1	lllllIIIlIlllll	Ljava/lang/String;
    //   72	4	2	lllllIIIllIIIIl	Ljava/lang/Exception;
    //   0	78	2	lllllIIIlIlllII	Ljava/lang/String;
    //   33	38	3	lllllIIIllIIIlI	Ljavax/crypto/Cipher;
    //   0	78	3	lllllIIIlIllIll	J
    //   26	45	2	lllllIIIllIIIll	Ljavax/crypto/spec/SecretKeySpec;
    //   0	78	0	lllllIIIlIllllI	C
    // Exception table:
    //   from	to	target	type
    //   0	70	71	java/lang/Exception
  }
  
  private static boolean llIIlII(double lllllIIIlIlIlll) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 != null);
  }
  
  static {
    llIIIII();
    lIlIIIl();
  }
}


/* Location:              C:\Users\J\Desktop\AVM.jar!\core\anticheat\checks\combat\WallHit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */