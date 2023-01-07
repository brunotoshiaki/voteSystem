package br.com.bruno.system.core.dataprovider;

public interface DoesScheduleHasVote {

  boolean execute(final Long idSchedule, final Long idAssociete);
}
