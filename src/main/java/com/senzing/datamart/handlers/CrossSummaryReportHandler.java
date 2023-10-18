package com.senzing.datamart.handlers;

import com.senzing.datamart.SzReplicationProvider;
import com.senzing.datamart.model.SzReportCode;

import static com.senzing.datamart.SzReplicationProvider.TaskAction;
import static com.senzing.datamart.SzReplicationProvider.TaskAction.*;

/**
 * Handles updates to the cross-source summary (CSS) report statistics.
 *
 * @see SzReportCode#CROSS_SOURCE_SUMMARY
 */
public class CrossSummaryReportHandler extends UpdateReportHandler {

  /**
   * Constructs with the specified {@link SzReplicationProvider}.  This
   * constructs the super class with {@link
   * TaskAction#UPDATE_CROSS_SOURCE_SUMMARY} as the supported action.
   *
   * @param provider The {@link SzReplicationProvider} to use.
   */
  public CrossSummaryReportHandler(SzReplicationProvider provider) {
    super(provider, UPDATE_CROSS_SOURCE_SUMMARY);
  }
}
