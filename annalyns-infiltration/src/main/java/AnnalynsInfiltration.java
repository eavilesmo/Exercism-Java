class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        boolean fastAttackIsPossible = !knightIsAwake;
        return fastAttackIsPossible;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean spyIsPossible = knightIsAwake || archerIsAwake || prisonerIsAwake;
        return spyIsPossible;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean signalPrisonerIsPossible = !archerIsAwake && prisonerIsAwake;
        return signalPrisonerIsPossible;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean freePrisonerIsPossible = false;
        if (petDogIsPresent && !archerIsAwake) {
            freePrisonerIsPossible = true;
        } else if (!petDogIsPresent && prisonerIsAwake && !knightIsAwake && !archerIsAwake) {
            freePrisonerIsPossible = true;
        }
        return freePrisonerIsPossible;
    }
}
