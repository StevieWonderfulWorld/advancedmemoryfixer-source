package core.anticheat.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.bukkit.entity.Player;

public class User {
  private static boolean lIIllllI(float llllIlIIIlllIIl) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 == null);
  }
  
  public int getEntities() {
    long llllIlIIlIIlllI = System.currentTimeMillis();
    ArrayList<Long> llllIlIIlIIllIl = new ArrayList<>();
    ArrayList<Integer> llllIlIIlIIllII = new ArrayList<>();
    int llllIlIIlIIlIll = lIIIlII[0];
    Iterator<Long> iterator = ((User)super).entities.keySet().iterator();
    "".length();
    if ("  ".length() <= 0)
      return (0xA1 ^ 0x9F ^ 0x51 ^ 0x29) & (0x2A ^ 0x7B ^ 0x6A ^ 0x7D ^ -" ".length()); 
    while (!lIIllllI(iterator.hasNext())) {
      long llllIlIIlIIlIlI = ((Long)iterator.next()).longValue();
      int llllIlIIlIIlIIl = ((Integer)((User)super).entities.get(Long.valueOf(llllIlIIlIIlIlI))).intValue();
      if (lIIllIll(lIIlllll(llllIlIIlIIlllI - llllIlIIlIIlIlI, 1000L))) {
        "".length();
        "".length();
        if ("   ".length() <= -" ".length())
          return (0x5F ^ 0xC ^ 0xBA ^ 0xBF) & (218 + 202 - 265 + 82 ^ 100 + 164 - 217 + 140 ^ -" ".length()); 
        continue;
      } 
      if (lIIllllI(llllIlIIlIIllII.contains(Integer.valueOf(llllIlIIlIIlIIl)))) {
        llllIlIIlIIlIll++;
        "".length();
      } 
    } 
    "".length();
    llllIlIIlIIllIl.clear();
    llllIlIIlIIllII.clear();
    ((User)super).lastTimeEntitiesCleaned = llllIlIIlIIlllI;
    return llllIlIIlIIlIll;
  }
  
  public void addEntity(String llllIlIIlIllIII) {
    "".length();
  }
  
  public int getHits() {
    // Byte code:
    //   0: invokestatic currentTimeMillis : ()J
    //   3: lstore_1
    //   4: new java/util/ArrayList
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_3
    //   12: getstatic core/anticheat/util/User.lIIIlII : [I
    //   15: iconst_0
    //   16: iaload
    //   17: istore #4
    //   19: aload_0
    //   20: getfield hits : Ljava/util/ArrayList;
    //   23: invokevirtual iterator : ()Ljava/util/Iterator;
    //   26: astore #7
    //   28: ldc ''
    //   30: invokevirtual length : ()I
    //   33: pop
    //   34: sipush #168
    //   37: sipush #155
    //   40: ixor
    //   41: bipush #87
    //   43: bipush #96
    //   45: ixor
    //   46: ixor
    //   47: bipush #111
    //   49: bipush #117
    //   51: iadd
    //   52: sipush #172
    //   55: isub
    //   56: sipush #198
    //   59: iadd
    //   60: sipush #169
    //   63: bipush #46
    //   65: iadd
    //   66: bipush #62
    //   68: isub
    //   69: bipush #30
    //   71: iadd
    //   72: ixor
    //   73: sipush #172
    //   76: bipush #100
    //   78: iadd
    //   79: bipush #98
    //   81: isub
    //   82: bipush #58
    //   84: iadd
    //   85: bipush #30
    //   87: bipush #112
    //   89: iadd
    //   90: bipush #125
    //   92: isub
    //   93: sipush #144
    //   96: iadd
    //   97: ixor
    //   98: ldc ' '
    //   100: invokevirtual length : ()I
    //   103: ineg
    //   104: ixor
    //   105: iand
    //   106: if_icmpge -> 245
    //   109: bipush #78
    //   111: bipush #25
    //   113: ixor
    //   114: bipush #121
    //   116: bipush #106
    //   118: ixor
    //   119: ixor
    //   120: bipush #99
    //   122: iconst_5
    //   123: ixor
    //   124: bipush #83
    //   126: bipush #113
    //   128: ixor
    //   129: ixor
    //   130: ldc ' '
    //   132: invokevirtual length : ()I
    //   135: ineg
    //   136: ixor
    //   137: iand
    //   138: ireturn
    //   139: aload #7
    //   141: invokeinterface next : ()Ljava/lang/Object;
    //   146: checkcast java/lang/Long
    //   149: invokevirtual longValue : ()J
    //   152: lstore #5
    //   154: lload_1
    //   155: lload #5
    //   157: lsub
    //   158: ldc2_w 1000
    //   161: invokestatic lIIllIlI : (JJ)I
    //   164: invokestatic lIIllIll : (I)Z
    //   167: ifeq -> 242
    //   170: aload_3
    //   171: lload #5
    //   173: invokestatic valueOf : (J)Ljava/lang/Long;
    //   176: invokevirtual add : (Ljava/lang/Object;)Z
    //   179: ldc ''
    //   181: invokevirtual length : ()I
    //   184: pop2
    //   185: ldc ''
    //   187: invokevirtual length : ()I
    //   190: pop
    //   191: ldc '  '
    //   193: invokevirtual length : ()I
    //   196: ifge -> 245
    //   199: bipush #50
    //   201: bipush #57
    //   203: ixor
    //   204: bipush #120
    //   206: bipush #43
    //   208: ixor
    //   209: ixor
    //   210: bipush #88
    //   212: bipush #57
    //   214: iadd
    //   215: bipush #-39
    //   217: isub
    //   218: bipush #17
    //   220: iadd
    //   221: bipush #53
    //   223: bipush #24
    //   225: iadd
    //   226: bipush #-24
    //   228: isub
    //   229: bipush #44
    //   231: iadd
    //   232: ixor
    //   233: ldc ' '
    //   235: invokevirtual length : ()I
    //   238: ineg
    //   239: ixor
    //   240: iand
    //   241: ireturn
    //   242: iinc #4, 1
    //   245: aload #7
    //   247: invokeinterface hasNext : ()Z
    //   252: invokestatic lIIllllI : (I)Z
    //   255: ifeq -> 139
    //   258: aload_0
    //   259: getfield hits : Ljava/util/ArrayList;
    //   262: aload_3
    //   263: invokevirtual removeAll : (Ljava/util/Collection;)Z
    //   266: ldc ''
    //   268: invokevirtual length : ()I
    //   271: pop2
    //   272: aload_3
    //   273: invokevirtual clear : ()V
    //   276: aload_0
    //   277: lload_1
    //   278: putfield lastTimeHitsCleaned : J
    //   281: iload #4
    //   283: ireturn
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   12	272	3	llllIlIIllIIllI	Ljava/util/ArrayList;
    //   154	91	5	llllIlIIllIIlII	J
    //   0	284	0	llllIlIIllIlIII	Lcore/anticheat/util/User;
    //   0	284	4	llllIlIIllIIIII	F
    //   0	284	3	llllIlIIllIIIIl	Ljava/lang/Exception;
    //   4	280	1	llllIlIIllIIlll	J
    //   19	265	4	llllIlIIllIIlIl	I
    //   0	284	7	llllIlIIlIllllI	F
    //   0	284	0	llllIlIIllIIIll	B
    //   0	284	5	llllIlIIlIlllll	B
    //   0	284	1	llllIlIIllIIIlI	Z
    // Local variable type table:
    //   start	length	slot	name	signature
    //   12	272	3	llllIlIIllIIllI	Ljava/util/ArrayList<Ljava/lang/Long;>;
  }
  
  public long getLastTimeEntitiesCleaned() {
    // Byte code:
    //   0: aload_0
    //   1: getfield lastTimeEntitiesCleaned : J
    //   4: lreturn
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	5	0	llllIlIIIllllII	Lcore/anticheat/util/User;
    //   0	5	0	llllIlIIIlllIll	D
  }
  
  public Player getPlayer() {
    // Byte code:
    //   0: aload_0
    //   1: getfield player : Lorg/bukkit/entity/Player;
    //   4: areturn
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	5	0	llllIlIIlllIIll	Lcore/anticheat/util/User;
    //   0	5	0	llllIlIIlllIIlI	S
  }
  
  private static boolean lIIllIll(char llllIlIIIllIlll) {
    return (SYNTHETIC_LOCAL_VARIABLE_0 > null);
  }
  
  static {
    lIIllIIl();
  }
  
  public long getLastTimeHitsCleaned() {
    return this.lastTimeHitsCleaned;
  }
  
  public void addHit() {
    "".length();
  }
  
  private static int lIIlllll(long paramLong1, long paramLong2) {
    return paramLong1 cmp paramLong2;
  }
  
  private static int lIIllIlI(long paramLong1, long paramLong2) {
    return paramLong1 cmp paramLong2;
  }
  
  public User(byte llllIlIIlllIlIl) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: dconst_0
    //   6: putfield oldY : D
    //   9: aload_0
    //   10: new java/util/ArrayList
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: putfield hits : Ljava/util/ArrayList;
    //   20: aload_0
    //   21: new java/util/HashMap
    //   24: dup
    //   25: invokespecial <init> : ()V
    //   28: putfield entities : Ljava/util/HashMap;
    //   31: aload_0
    //   32: lconst_0
    //   33: putfield lastTimeHitsCleaned : J
    //   36: aload_0
    //   37: lconst_0
    //   38: putfield lastTimeEntitiesCleaned : J
    //   41: aload_0
    //   42: getstatic core/anticheat/util/User.lIIIlII : [I
    //   45: iconst_0
    //   46: iaload
    //   47: putfield wasGoingUp : Z
    //   50: aload_0
    //   51: getstatic core/anticheat/util/User.lIIIlII : [I
    //   54: iconst_0
    //   55: iaload
    //   56: putfield oldYModifier : I
    //   59: aload_0
    //   60: getstatic core/anticheat/util/User.lIIIlII : [I
    //   63: iconst_0
    //   64: iaload
    //   65: putfield ticksUp : I
    //   68: aload_0
    //   69: getstatic core/anticheat/util/User.lIIIlII : [I
    //   72: iconst_0
    //   73: iaload
    //   74: putfield oldTicksUp : I
    //   77: aload_0
    //   78: aload_1
    //   79: putfield player : Lorg/bukkit/entity/Player;
    //   82: return
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	83	1	llllIlIIlllIlll	Lorg/bukkit/entity/Player;
    //   0	83	0	llllIlIIllllIII	Lcore/anticheat/util/User;
    //   0	83	0	llllIlIIlllIllI	F
    //   0	83	1	llllIlIIlllIlIl	B
  }
  
  private static void lIIllIIl() {
    lIIIlII = new int[1];
    lIIIlII[0] = (0x65 ^ 0xB ^ 0x84 ^ 0xB1) & (167 + 155 - 157 + 36 ^ 23 + 142 - 159 + 140 ^ -" ".length());
  }
}


/* Location:              C:\Users\J\Desktop\AVM.jar!\core\antichea\\util\User.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */