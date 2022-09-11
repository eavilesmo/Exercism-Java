class SpaceAge {
    private final double seconds;
    private final int earthOrbitalPeriodInSeconds = 31557600;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        double ageOnEarth = seconds / earthOrbitalPeriodInSeconds;
        return ageOnEarth;
    }

    double onMercury() {
        double mercuryOrbitalPeriod = earthOrbitalPeriodInSeconds * 0.2408467;
        double ageOnMercury = seconds / mercuryOrbitalPeriod;
        return ageOnMercury;
    }

    double onVenus() {
        double venusOrbitalPeriod = earthOrbitalPeriodInSeconds * 0.61519726;
        double ageOnVenus = seconds / venusOrbitalPeriod;
        return ageOnVenus;
    }

    double onMars() {
        double marsOrbitalPeriod = earthOrbitalPeriodInSeconds * 1.8808158;
        double ageOnMars = seconds / marsOrbitalPeriod;
        return ageOnMars;
    }

    double onJupiter() {
        double jupiterOrbitalPeriod = earthOrbitalPeriodInSeconds * 11.862615;
        double ageOnJupiter = seconds / jupiterOrbitalPeriod;
        return ageOnJupiter;
    }

    double onSaturn() {
        double saturnOrbitalPeriod = earthOrbitalPeriodInSeconds * 29.447498;
        double ageOnSaturn = seconds / saturnOrbitalPeriod;
        return ageOnSaturn;
    }

    double onUranus() {
        double uranusOrbitalPeriod = earthOrbitalPeriodInSeconds * 84.016846;
        double ageOnUranus = seconds / uranusOrbitalPeriod;
        return ageOnUranus;
    }

    double onNeptune() {
        double neptuneOrbitalPeriod = earthOrbitalPeriodInSeconds * 164.79132;
        double ageOnNeptune = seconds / neptuneOrbitalPeriod;
        return ageOnNeptune;
    }

}
