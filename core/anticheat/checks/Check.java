package core.anticheat.checks;

public abstract class Check {
  public Check(CheckType lllllllllIllIll) {
    ((Check)super).type = lllllllllIllIll;
    ((Check)super).cancelType = CancelType.EVENT;
  }
  
  public CancelType getCancelType() {
    // Byte code:
    //   0: aload_0
    //   1: getfield cancelType : Lcore/anticheat/checks/CancelType;
    //   4: areturn
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	5	0	lllllllllIIIlII	Lcore/anticheat/checks/Check;
    //   0	5	0	lllllllllIIIIlI	F
  }
  
  public void debug(Object llllllllIlllIIl) {
    "".length();
  }
  
  public CheckType getType() {
    // Byte code:
    //   0: aload_0
    //   1: getfield type : Lcore/anticheat/checks/CheckType;
    //   4: areturn
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	5	0	lllllllllIIlIlI	Lcore/anticheat/checks/Check;
    //   0	5	0	lllllllllIIlIIl	C
  }
}


/* Location:              C:\Users\J\Desktop\AVM.jar!\core\anticheat\checks\Check.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */