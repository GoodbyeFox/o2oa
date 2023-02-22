var apps = [
    { "folder": "o2_lib", "tasks": ["move"] },
    { "folder": "o2_core", "tasks": ["move", "min"] },
    { "folder": "x_component_ANN", "tasks": ["move", "min"] },
    { "folder": "x_component_AppCenter", "tasks": ["move", "min"] },
    { "folder": "x_component_AppMarketV2", "tasks": ["move", "min"] },
    { "folder": "x_component_AppMarketV2_Application", "tasks": ["move", "min"] },
    { "folder": "x_component_Attendance", "tasks": ["move", "min"] },
    { "folder": "x_component_AuditLog", "tasks": ["move", "min"] },
    { "folder": "x_component_BAM", "tasks": ["move", "min"] },
    { "folder": "x_component_Calendar", "tasks": ["move", "min"] },
    { "folder": "x_component_cms_Column", "tasks": ["move", "min"] },
    { "folder": "x_component_cms_ColumnManager", "tasks": ["move", "min"] },
    { "folder": "x_component_cms_DictionaryDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_cms_Document", "tasks": ["move", "min"] },
    { "folder": "x_component_cms_FormDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_cms_Index", "tasks": ["move", "min"] },
    { "folder": "x_component_cms_Module", "tasks": ["move", "min"] },
    { "folder": "x_component_cms_QueryViewDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_cms_ScriptDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_cms_ViewDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_cms_Xform", "tasks": ["move", "min"] },
    { "folder": "x_component_Collect", "tasks": ["move", "min"] },
    { "folder": "x_component_Common", "tasks": ["move", "min"] },
    { "folder": "x_component_Console", "tasks": ["move", "min"] },
    { "folder": "x_component_ControlPanel", "tasks": ["move", "min"] },
    { "folder": "x_component_CRM", "tasks": ["move", "min"] },
    { "folder": "x_component_Deployment", "tasks": ["move", "min"] },
    { "folder": "x_component_DesignCenter", "tasks": ["move", "min"] },
    { "folder": "x_component_Empty", "tasks": ["move", "min"] },
    { "folder": "x_component_FaceSet", "tasks": ["move", "min"] },
    { "folder": "x_component_File", "tasks": ["move", "min"] },
    { "folder": "x_component_FindDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_Forum", "tasks": ["move", "min"] },
    { "folder": "x_component_ForumCategory", "tasks": ["move", "min"] },
    { "folder": "x_component_ForumDocument", "tasks": ["move", "min"] },
    { "folder": "x_component_ForumPerson", "tasks": ["move", "min"] },
    { "folder": "x_component_ForumSearch", "tasks": ["move", "min"] },
    { "folder": "x_component_ForumSection", "tasks": ["move", "min"] },
    { "folder": "x_component_Homepage", "tasks": ["move", "min"] },
    { "folder": "x_component_HotArticle", "tasks": ["move", "min"] },
    { "folder": "x_component_LogViewer", "tasks": ["move", "min"] },
    { "folder": "x_component_Meeting", "tasks": ["move", "min"] },
    { "folder": "x_component_Minder", "tasks": ["move", "min"] },
    { "folder": "x_component_MinderEditor", "tasks": ["move", "min"] },
    { "folder": "x_component_Note", "tasks": ["move", "min"] },
    { "folder": "x_component_OKR", "tasks": ["move", "min"] },
    { "folder": "x_component_Org", "tasks": ["move", "min"] },
    { "folder": "x_component_portal_PageDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_portal_Portal", "tasks": ["move", "min"] },
    { "folder": "x_component_portal_PortalExplorer", "tasks": ["move", "min"] },
    { "folder": "x_component_portal_PortalManager", "tasks": ["move", "min"] },
    { "folder": "x_component_portal_ScriptDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_portal_WidgetDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_process_Application", "tasks": ["move", "min"] },
    { "folder": "x_component_process_ApplicationExplorer", "tasks": ["move", "min"] },
    { "folder": "x_component_process_DictionaryDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_process_FormDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_process_ProcessDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_process_ProcessManager", "tasks": ["move", "min"] },
    { "folder": "x_component_process_ScriptDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_process_StatDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_process_TaskCenter", "tasks": ["move", "min"] },
    { "folder": "x_component_process_ViewDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_process_WidgetDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_process_Work", "tasks": ["move", "min"] },
    { "folder": "x_component_process_Xform", "tasks": ["move", "min"] },
    { "folder": "x_component_Profile", "tasks": ["move", "min"] },
    { "folder": "x_component_query_ImporterDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_query_Query", "tasks": ["move", "min"] },
    { "folder": "x_component_query_QueryExplorer", "tasks": ["move", "min"] },
    { "folder": "x_component_query_QueryManager", "tasks": ["move", "min"] },
    { "folder": "x_component_query_StatDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_query_ViewDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_query_TableDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_query_StatementDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_Search", "tasks": ["move", "min"] },
    { "folder": "x_component_ftsearch", "tasks": ["move", "min"] },
    { "folder": "x_component_StandingBook", "tasks": ["move", "min"] },
    { "folder": "x_component_Selector", "tasks": ["move", "min"] },
    { "folder": "x_component_service_AgentDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_service_InvokeDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_service_ServiceManager", "tasks": ["move", "min"] },
    { "folder": "x_component_Setting", "tasks": ["move", "min"] },
    { "folder": "x_component_Template", "tasks": ["move", "min"] },
    { "folder": "x_component_ThreeMember", "tasks": ["move", "min"] },
    { "folder": "x_desktop", "tasks": ["move", "min"] },
    { "folder": "x_component_IMV2", "tasks": ["move", "min"] },
    { "folder": "x_component_ConfigDesigner", "tasks": ["move", "min"] },
    { "folder": "x_component_process_workcenter", "tasks": ["move", "min"] },

];

module.exports = apps;
