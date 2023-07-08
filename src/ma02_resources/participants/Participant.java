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

public interface Participant extends Cloneable {
    String getName();

    String getEmail();

    Contact getContact();

    Instituition getInstituition();

    void setInstituition(Instituition var1);

    void setContact(Contact var1);

    boolean equals(Object var1);
}
