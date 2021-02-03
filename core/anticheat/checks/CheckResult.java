package core.anticheat.checks;

public class CheckResult {
  public boolean failed() {
    return this.failed;
  }
  
  public String getMessage() {
    // Byte code:
    //   0: aload_0
    //   1: getfield message : Ljava/lang/String;
    //   4: areturn
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	5	0	llllllIlIlIIIII	Lcore/anticheat/checks/CheckResult;
    //   0	5	0	llllllIlIIlllll	D
  }
  
  public CheckType getType() {
    return ((CheckResult)super).type;
  }
  
  public CheckResult(boolean llllllIlIllIIIl, CheckType llllllIlIllIIII, String llllllIlIlIllll) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: iload_1
    //   6: putfield failed : Z
    //   9: aload_0
    //   10: aload_2
    //   11: putfield type : Lcore/anticheat/checks/CheckType;
    //   14: aload_0
    //   15: aload_3
    //   16: putfield message : Ljava/lang/String;
    //   19: return
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	20	3	llllllIlIlIlIII	Z
    //   0	20	0	llllllIlIllIIlI	Lcore/anticheat/checks/CheckResult;
    //   0	20	0	llllllIlIlIlllI	F
    //   0	20	1	llllllIlIlIllII	B
    //   0	20	1	llllllIlIllIIIl	Z
    //   0	20	3	llllllIlIlIllll	Ljava/lang/String;
    //   0	20	2	llllllIlIlIlIlI	F
    //   0	20	2	llllllIlIllIIII	Lcore/anticheat/checks/CheckType;
  }
}


/* Location:              C:\Users\J\Desktop\AVM.jar!\core\anticheat\checks\CheckResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */