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

import java.time.LocalDateTime;
import ma02_resources.participants.Student;

public interface Submission extends Comparable<Submission> {
    LocalDateTime getDate();

    Student getStudent();

    String getText();

    int compareTo(Submission var1);
}
