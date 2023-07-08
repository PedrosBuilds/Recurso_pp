/*
 * Nome: Pedro Marques
 * Número: 8190750
 * Turma: LSIRC12T2
 *
 * Nome: Francisco Faria
 * Número: 8180335
 * Turma: LSIRC12T2
 */

package ma02_resources.participants;

public enum InstituitionType {
    UNIVERSITY,
    COMPANY,
    NGO,
    OTHER;

    private InstituitionType() {
    }

    public String toString() {
        switch (this) {
            case UNIVERSITY:
                return "Universitary";
            case COMPANY:
                return "Company";
            case NGO:
                return "NGO";
            case OTHER:
                return "Other";
            default:
                return "Unknown";
        }
    }
}
