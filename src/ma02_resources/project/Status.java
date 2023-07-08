/*
 * Nome: Pedro Marques
 * Número: 8190750
 * Turma: LSIRC12T2
 *
 * Nome: Francisco Faria
 * Número: 8180335
 * Turma: LSIRC12T2
 */

package ma02_resources.project;

public enum Status {
    ACTIVE,
    INACTIVE,
    CANCELED,
    CLOSED;

    private Status() {
    }

    public String toString() {
        switch (this) {
            case ACTIVE:
                return "Active";
            case INACTIVE:
                return "Inactive";
            case CLOSED:
                return "Closed";
            case CANCELED:
                return "Canceled";
            default:
                return "Unknown";
        }
    }
}
