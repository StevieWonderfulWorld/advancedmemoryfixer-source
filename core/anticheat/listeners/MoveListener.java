package core.anticheat.listeners;

import core.anticheat.Core;
import core.anticheat.checks.CheckResult;
import core.anticheat.checks.movement.GeneralMovement;
import core.anticheat.checks.movement.NoFall;
import core.anticheat.checks.movement.flight.FlightA;
import core.anticheat.checks.movement.speed.SpeedA;
import core.anticheat.util.Distance;
import core.anticheat.util.User;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerMoveEvent;

public class MoveListener {
  private static boolean lIIIllIl(float llllIlIlIlIllll, boolean llllIlIlIlIlllI) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 < SYNTHETIC_LOCAL_VARIABLE_1);
  }
  
  private static String llIllIl(float llllIlIllIIIlll, String llllIlIllIIlIll) {
    // Byte code:
    //   0: new java/lang/String
    //   3: dup
    //   4: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   7: aload_0
    //   8: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   11: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   14: invokevirtual decode : ([B)[B
    //   17: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   20: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   23: astore_0
    //   24: new java/lang/StringBuilder
    //   27: dup
    //   28: invokespecial <init> : ()V
    //   31: astore_2
    //   32: aload_1
    //   33: invokevirtual toCharArray : ()[C
    //   36: astore_3
    //   37: getstatic core/anticheat/listeners/MoveListener.lllIIl : [I
    //   40: iconst_0
    //   41: iaload
    //   42: istore #4
    //   44: aload_0
    //   45: invokevirtual toCharArray : ()[C
    //   48: astore #5
    //   50: aload #5
    //   52: arraylength
    //   53: istore #6
    //   55: getstatic core/anticheat/listeners/MoveListener.lllIIl : [I
    //   58: iconst_0
    //   59: iaload
    //   60: istore #7
    //   62: iload #7
    //   64: iload #6
    //   66: invokestatic lIIIllIl : (II)Z
    //   69: ifeq -> 122
    //   72: aload #5
    //   74: iload #7
    //   76: caload
    //   77: istore #8
    //   79: aload_2
    //   80: iload #8
    //   82: aload_3
    //   83: iload #4
    //   85: aload_3
    //   86: arraylength
    //   87: irem
    //   88: caload
    //   89: ixor
    //   90: i2c
    //   91: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   94: ldc ''
    //   96: invokevirtual length : ()I
    //   99: pop2
    //   100: iinc #4, 1
    //   103: iinc #7, 1
    //   106: ldc ''
    //   108: invokevirtual length : ()I
    //   111: pop
    //   112: ldc '   '
    //   114: invokevirtual length : ()I
    //   117: ifge -> 62
    //   120: aconst_null
    //   121: areturn
    //   122: aload_2
    //   123: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   126: areturn
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	127	0	llllIlIllIIllII	Ljava/lang/String;
    //   0	127	8	llllIlIlIllllll	Z
    //   0	127	5	llllIlIllIIIIlI	Z
    //   0	127	3	llllIlIllIIIlII	S
    //   0	127	4	llllIlIllIIIIll	B
    //   37	90	3	llllIlIllIIlIIl	[C
    //   79	24	8	llllIlIllIIllIl	C
    //   0	127	0	llllIlIllIIIlll	F
    //   32	95	2	llllIlIllIIlIlI	Ljava/lang/StringBuilder;
    //   0	127	7	llllIlIllIIIIII	S
    //   0	127	2	llllIlIllIIIlIl	D
    //   44	83	4	llllIlIllIIlIII	I
    //   0	127	6	llllIlIllIIIIIl	I
    //   0	127	1	llllIlIllIIIllI	J
    //   0	127	1	llllIlIllIIlIll	Ljava/lang/String;
  }
  
  private static void lIIIIIII() {
    llIIIl = new String[lllIIl[6]];
    llIIIl[lllIIl[0]] = llIllIl("AC8iIiQQaSouOQYqIi87TSIpIC0PIiM=", "cGGAO");
    llIIIl[lllIIl[1]] = lllIIII("H37lEruX8kZSRmKTXN//Efeopk0Bjkcx", "qzKGt");
    llIIIl[lllIIl[2]] = llllIIl("MICSTxVkrpq6N/DhR8NB5e2eSgPVDwUD", "pXXlB");
    llIIIl[lllIIl[3]] = llIllIl("EgQoEzsCQiMfNhAAIV41Hw0vHDUV", "qlMpP");
    llIIIl[lllIIl[4]] = lllIIII("k0ncbQEcfjd9u+W5t7dYaf/yU0FmCFof", "iBtJJ");
    llIIIl[lllIIl[5]] = lllIIII("rpNxUfaAnZq5Kng9LiiIcxB5Ir1BdVA0", "tBdKe");
  }
  
  private static String llllIIl(String llllIlIlIllIlll, String llllIlIlIllIlII) {
    try {
      SecretKeySpec llllIlIlIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIlIlIllIlII.getBytes(StandardCharsets.UTF_8)), lllIIl[7]), "DES");
      Cipher llllIlIlIlllIIl = Cipher.getInstance("DES");
      llllIlIlIlllIIl.init(lllIIl[2], llllIlIlIlllIlI);
      return new String(llllIlIlIlllIIl.doFinal(Base64.getDecoder().decode(llllIlIlIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
    } catch (Exception llllIlIlIlllIII) {
      llllIlIlIlllIII.printStackTrace();
      return null;
    } 
  }
  
  @EventHandler
  public void onMove(PlayerMoveEvent llllIlIllllIIII) {
    User llllIlIlllIllll = Core.getUser(llllIlIllllIIII.getPlayer());
    Distance llllIlIlllIlllI = new Distance(llllIlIllllIIII);
    if (lIIIllII(plugin.getConfig().getBoolean(llIIIl[lllIIl[0]]))) {
      CheckResult llllIlIlllIllIl = GeneralMovement.runCheck(llllIlIlllIllll, llllIlIlllIlllI);
      if (lIIIllII(llllIlIlllIllIl.failed()))
        Core.log(llllIlIlllIllll, llllIlIlllIllIl); 
    } 
    if (lIIIllII(plugin.getConfig().getBoolean(llIIIl[lllIIl[1]]))) {
      CheckResult llllIlIlllIllII = FlightA.runCheck(llllIlIlllIllll, llllIlIlllIlllI);
      if (lIIIllII(llllIlIlllIllII.failed()))
        Core.log(llllIlIlllIllll, llllIlIlllIllII); 
    } 
    if (lIIIllII(plugin.getConfig().getBoolean(llIIIl[lllIIl[2]]))) {
      CheckResult llllIlIlllIlIll = SpeedA.runCheck(llllIlIlllIllll, llllIlIlllIlllI);
      if (lIIIllII(llllIlIlllIlIll.failed()))
        Core.log(llllIlIlllIllll, llllIlIlllIlIll); 
    } 
    if (lIIIllII(plugin.getConfig().getBoolean(llIIIl[lllIIl[3]]))) {
      CheckResult llllIlIlllIlIlI = NoFall.runCheck(llllIlIlllIllll, llllIlIlllIlllI);
      if (lIIIllII(llllIlIlllIlIlI.failed()))
        Core.log(llllIlIlllIllll, llllIlIlllIlIlI); 
    } 
    if (lIIIllII(plugin.getConfig().getBoolean(llIIIl[lllIIl[4]]))) {
      CheckResult llllIlIlllIlIIl = GeneralMovement.runCheck(llllIlIlllIllll, llllIlIlllIlllI);
      if (lIIIllII(llllIlIlllIlIIl.failed()))
        Core.log(llllIlIlllIllll, llllIlIlllIlIIl); 
    } 
    if (lIIIllII(plugin.getConfig().getBoolean(llIIIl[lllIIl[5]]))) {
      CheckResult llllIlIlllIlIII = GeneralMovement.runCheck(llllIlIlllIllll, llllIlIlllIlllI);
      if (lIIIllII(llllIlIlllIlIII.failed()))
        Core.log(llllIlIlllIllll, llllIlIlllIlIII); 
    } 
  }
  
  private static boolean lIIIllII(float llllIlIlIlIllII) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 != null);
  }
  
  private static void lIIIlIll() {
    lllIIl = new int[8];
    lllIIl[0] = (0xBE ^ 0x93) & (0xAA ^ 0x87 ^ 0xFFFFFFFF);
    lllIIl[1] = " ".length();
    lllIIl[2] = "  ".length();
    lllIIl[3] = "   ".length();
    lllIIl[4] = 0x98 ^ 0x9C;
    lllIIl[5] = 0x75 ^ 0x70;
    lllIIl[6] = 152 + 114 - 87 + 12 ^ 134 + 135 - 243 + 159;
    lllIIl[7] = 0x88 ^ 0x80;
  }
  
  private static String lllIIII(String llllIlIllIlllII, char llllIlIllIllIIl) {
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
    //   34: getstatic core/anticheat/listeners/MoveListener.lllIIl : [I
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
    //   72	4	2	llllIlIllIlllIl	Ljava/lang/Exception;
    //   0	78	1	llllIlIllIllIll	Ljava/lang/String;
    //   0	78	0	llllIlIllIllIlI	J
    //   0	78	3	llllIlIllIlIlll	I
    //   0	78	0	llllIlIllIlllII	Ljava/lang/String;
    //   33	38	3	llllIlIllIllllI	Ljavax/crypto/Cipher;
    //   0	78	1	llllIlIllIllIIl	C
    //   0	78	2	llllIlIllIllIII	B
    //   26	45	2	llllIlIllIlllll	Ljavax/crypto/spec/SecretKeySpec;
    // Exception table:
    //   from	to	target	type
    //   0	70	71	java/lang/Exception
  }
  
  static {
    lIIIlIll();
    lIIIIIII();
  }
}


/* Location:              C:\Users\J\Desktop\AVM.jar!\core\anticheat\listeners\MoveListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */