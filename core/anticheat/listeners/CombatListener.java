package core.anticheat.listeners;

import core.anticheat.Core;
import core.anticheat.api.onEnable;
import core.anticheat.checks.CheckResult;
import core.anticheat.checks.combat.Reach;
import core.anticheat.util.User;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class CombatListener {
  static {
    lllI();
    llII();
  }
  
  private static void llII() {
    lIl = new String[lllI[4]];
    lIl[lllI[0]] = I("Oz0WEiUrewEULzs9XRQgOTcfFCo=", "XUsqN");
    lIl[lllI[1]] = lIl("qbzs/GAB+RqtZ9a0E8jPmBHqTHxTu8ut", "ssXiI");
    lIl[lllI[2]] = I("EB88EDoAWTEaJQAHPBY1XRI3EjMfEj0=", "swYsQ");
    lIl[lllI[3]] = lIl("pNdPYgxHpP0WOR9MwBgCgUDmExcnpH8XvtNMtgLxFl4=", "vEQLM");
  }
  
  private static boolean lIllI(float lllllllIIlIIlll, float lllllllIIlIIllI) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 < SYNTHETIC_LOCAL_VARIABLE_1);
  }
  
  private static boolean lIIII(boolean lllllllIIlIIlII) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 != null);
  }
  
  @EventHandler
  public void onDamage(EntityDamageByEntityEvent llllllllIIIIIII) {
    if (lIIII(llllllllIIIIIII.getDamager() instanceof Player)) {
      Player lllllllIlllllll = (Player)llllllllIIIIIII.getDamager();
      User lllllllIllllllI = Core.getUser(lllllllIlllllll);
      if (lIIII(onEnable.config.getBoolean(lIl[lllI[0]]))) {
        CheckResult lllllllIlllllIl = Reach.runCheck(lllllllIllllllI, llllllllIIIIIII.getEntity());
        if (lIIII(lllllllIlllllIl.failed()))
          Core.log(lllllllIllllllI, lllllllIlllllIl); 
      } 
      if (lIIII(((CombatListener)super).plugin.getConfig().getBoolean(lIl[lllI[1]]))) {
        CheckResult lllllllIlllllII = Reach.runCheck(lllllllIllllllI, llllllllIIIIIII.getEntity());
        if (lIIII(lllllllIlllllII.failed()))
          Core.log(lllllllIllllllI, lllllllIlllllII); 
      } 
      if (lIIII(((CombatListener)super).plugin.getConfig().getBoolean(lIl[lllI[2]]))) {
        CheckResult lllllllIllllIll = Reach.runCheck(lllllllIllllllI, llllllllIIIIIII.getEntity());
        if (lIIII(lllllllIllllIll.failed()))
          Core.log(lllllllIllllllI, lllllllIllllIll); 
      } 
      if (lIIII(((CombatListener)super).plugin.getConfig().getBoolean(lIl[lllI[3]]))) {
        CheckResult lllllllIllllIlI = Reach.runCheck(lllllllIllllllI, llllllllIIIIIII.getEntity());
        if (lIIII(lllllllIllllIlI.failed()))
          Core.log(lllllllIllllllI, lllllllIllllIlI); 
      } 
    } 
  }
  
  private static void lllI() {
    lllI = new int[6];
    lllI[0] = (0x60 ^ 0x35) & (0xED ^ 0xB8 ^ 0xFFFFFFFF);
    lllI[1] = " ".length();
    lllI[2] = "  ".length();
    lllI[3] = "   ".length();
    lllI[4] = 61 + 132 - 77 + 32 ^ 50 + 139 - 107 + 62;
    lllI[5] = 0x6E ^ 0x39 ^ 0x7D ^ 0x22;
  }
  
  private static String I(String lllllllIllIIlll, String lllllllIllIIllI) {
    String str = new String(Base64.getDecoder().decode(lllllllIllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
    StringBuilder lllllllIllIIlIl = new StringBuilder();
    char[] lllllllIllIIlII = lllllllIllIIllI.toCharArray();
    int lllllllIllIIIll = lllI[0];
    char[] arrayOfChar1 = str.toCharArray();
    int i = arrayOfChar1.length;
    int j = lllI[0];
    while (lIllI(j, i)) {
      char lllllllIllIlIII = arrayOfChar1[j];
      "".length();
      lllllllIllIIIll++;
      j++;
      "".length();
      if (null != null)
        return null; 
    } 
    return String.valueOf(lllllllIllIIlIl);
  }
  
  private static String lIl(float lllllllIIlllIlI, String lllllllIIllllII) {
    // Byte code:
    //   0: new javax/crypto/spec/SecretKeySpec
    //   3: dup
    //   4: ldc 'MD5'
    //   6: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/MessageDigest;
    //   9: aload_1
    //   10: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   13: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   16: invokevirtual digest : ([B)[B
    //   19: getstatic core/anticheat/listeners/CombatListener.lllI : [I
    //   22: iconst_5
    //   23: iaload
    //   24: invokestatic copyOf : ([BI)[B
    //   27: ldc 'DES'
    //   29: invokespecial <init> : ([BLjava/lang/String;)V
    //   32: astore_2
    //   33: ldc 'DES'
    //   35: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   38: astore_3
    //   39: aload_3
    //   40: getstatic core/anticheat/listeners/CombatListener.lllI : [I
    //   43: iconst_2
    //   44: iaload
    //   45: aload_2
    //   46: invokevirtual init : (ILjava/security/Key;)V
    //   49: new java/lang/String
    //   52: dup
    //   53: aload_3
    //   54: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   57: aload_0
    //   58: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   61: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   64: invokevirtual decode : ([B)[B
    //   67: invokevirtual doFinal : ([B)[B
    //   70: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   73: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   76: areturn
    //   77: astore_2
    //   78: aload_2
    //   79: invokevirtual printStackTrace : ()V
    //   82: aconst_null
    //   83: areturn
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	84	3	lllllllIIllIlII	B
    //   0	84	1	lllllllIIlllIII	Z
    //   0	84	0	lllllllIIlllllI	Ljava/lang/String;
    //   0	84	0	lllllllIIlllIlI	F
    //   33	44	2	lllllllIlIIIlII	Ljavax/crypto/spec/SecretKeySpec;
    //   0	84	1	lllllllIIllllII	Ljava/lang/String;
    //   78	4	2	lllllllIlIIIIII	Ljava/lang/Exception;
    //   39	38	3	lllllllIlIIIIlI	Ljavax/crypto/Cipher;
    //   0	84	2	lllllllIIllIllI	F
    // Exception table:
    //   from	to	target	type
    //   0	76	77	java/lang/Exception
  }
}


/* Location:              C:\Users\J\Desktop\AVM.jar!\core\anticheat\listeners\CombatListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */