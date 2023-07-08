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

public interface Contact extends Cloneable {
    String getStreet();

    String getCity();

    String getState();

    String getZipCode();

    String getCountry();

    String getPhone();

    boolean equals(Object var1);
}
