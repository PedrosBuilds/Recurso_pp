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

public interface Instituition extends Cloneable {
    String getName();

    String getEmail();

    InstituitionType getType();

    Contact getContact();

    String getWebsite();

    String getDescription();

    void setWebsite(String var1);

    void setDescription(String var1);

    void setContact(Contact var1);

    void setType(InstituitionType var1);

    boolean equals(Object var1);
}
