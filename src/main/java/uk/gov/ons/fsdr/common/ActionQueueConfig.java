package uk.gov.ons.fsdr.common;

public class ActionQueueConfig {

  public static final String ACTION_RESULT_ROUTING_KEY = "action.result.request";
  public static final String ACTION_RESULT_EXCHANGE = "action.result.exchange";

  public static final String GSUITE_ACTIONS_ROUTING_KEY = "gsuite.actions.request";

  public static final String XMA_LEAVER_ROUTING_KEY = "xma.leaver.request";
  public static final String XMA_AREA_MANAGER_ROUTING_KEY = "xma.area.manager.request";
  public static final String XMA_COORDINATOR_ROUTING_KEY = "xma.coordinator.request";
  public static final String XMA_FIELD_OFFICER_ROUTING_KEY = "xma.field.officer.request";

  public static final String SERVICE_NOW_LEAVER_ACTIONS_ROUTING_KEY = "servicenow.leaver.actions.request";
  public static final String SERVICE_NOW_MOVER_ACTIONS_ROUTING_KEY = "servicenow.mover.actions.request";
  public static final String SERVICE_NOW_ACTIONS_ROUTING_KEY = "servicenow.actions.request";

  public static final String LWS_ACTIONS_ROUTING_KEY = "lws.actions.request";

  public static final String ADECCO_ACTIONS_ROUTING_KEY = "adecco.actions.request";

  public static final String ACTION_REQUEST_EXCHANGE = "action.request.exchange";

  public static final String HQ_ROLE_ID_EXCHANGE = "hq.roleid.exchange";

  public static final String HQ_ROLE_ID_ROUTING_KEY = "hq.roleid";

}
