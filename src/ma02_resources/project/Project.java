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

import ma02_resources.participants.Participant;
import ma02_resources.project.exceptions.IllegalNumberOfParticipantType;
import ma02_resources.project.exceptions.IllegalNumberOfTasks;
import ma02_resources.project.exceptions.ParticipantAlreadyInProject;
import ma02_resources.project.exceptions.TaskAlreadyInProject;

public interface Project {
    String getName();

    String getDescription();

    int getNumberOfParticipants();

    int getNumberOfStudents();

    int getNumberOfPartners();

    int getNumberOfFacilitators();

    int getNumberOfTasks();

    int getMaximumNumberOfTasks();

    long getMaximumNumberOfParticipants();

    int getMaximumNumberOfStudents();

    int getMaximumNumberOfPartners();

    int getMaximumNumberOfFacilitators();

    void addParticipant(Participant var1) throws IllegalNumberOfParticipantType, ParticipantAlreadyInProject;

    Participant removeParticipant(String var1);

    Participant getParticipant(String var1);

    String[] getTags();

    boolean hasTag(String var1);

    void addTask(Task var1) throws IllegalNumberOfTasks, TaskAlreadyInProject;

    Task getTask(String var1);

    Task[] getTasks();
    //new
    void removeTask(String title);
    boolean isCompleted();

    boolean equals(Object var1);
    //criação de metodo
    Participant[] getParticipants();
}
