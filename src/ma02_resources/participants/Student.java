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

public interface Student extends Participant {
    int getNumber();
    void addEvaluation(StudentEvaluation evaluation);
    double getFinalEvaluation();
}
