/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2020 DBeaver Corp and others
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.ui.dashboard.internal;

import org.eclipse.osgi.util.NLS;

public class UIDashboardMessages extends NLS {
    public static final String BUNDLE_NAME = "org.jkiss.dbeaver.ui.dashboard.internal.UIDashboardMessages"; //$NON-NLS-1$

    public static String pref_page_dashboards_group_common;
    public static String pref_page_dashboards_open_separate_connection_label;
    
    public static String add_dialog_dashboards_message_no_more_dashboards;
    public static String add_dialog_dashboards_button_manage;
    public static String add_dialog_dashboards_button_add;
    public static String add_dialog_dashboards_title;
    public static String add_dialog_dashboards_table_name;
    public static String add_dialog_dashboards_table_description;
    
    // Dashboards Edit Dialog
    public static String edit_dialog_dashboards_title;
    public static String edit_dialog_dashboards_bracket;
    public static String edit_dialog_dashboards_group_main;
    public static String edit_dialog_dashboards_group_queries;
    public static String edit_dialog_dashboards_group_rendering;
    public static String edit_dialog_dashboards_label_info_queries;
    public static String edit_dialog_dashboards_label_info_main;
    public static String edit_dialog_dashboards_label_ID;
    public static String edit_dialog_dashboards_label_name;
    public static String edit_dialog_dashboards_label_database;
    public static String edit_dialog_dashboards_label_data_type;
    public static String edit_dialog_dashboards_label_value_type;
    public static String edit_dialog_dashboards_label_fetch_type;
    public static String edit_dialog_dashboards_label_calc_type;
    public static String edit_dialog_dashboards_label_interval;
    public static String edit_dialog_dashboards_label_description;
    public static String edit_dialog_dashboards_label_view;
    public static String edit_dialog_dashboards_label_update_period;
    public static String edit_dialog_dashboards_label_maximum_items;
    public static String edit_dialog_dashboards_label_tip_data_type;
    public static String edit_dialog_dashboards_label_tip_value_type;
    public static String edit_dialog_dashboards_label_tip_fetch_type;
    public static String edit_dialog_dashboards_label_tip_calc_type;
    public static String edit_dialog_dashboards_label_tip_interval;
    public static String edit_dialog_dashboards_label_tip_view;
    public static String edit_dialog_dashboards_descriptor_keys;
    public static String edit_dialog_dashboards_descriptor_labels;
    public static String edit_dialog_dashboards_button_select;
    
    public static String config_dialog_dashboards_title;
    public static String config_dialog_dashboards_bracket;
    public static String config_dialog_dashboards_group_info;
    public static String config_dialog_dashboards_group_update;
    public static String config_dialog_dashboards_group_view;
    public static String config_dialog_dashboards_label_name;
    public static String config_dialog_dashboards_label_description;
    public static String config_dialog_dashboards_label_update;
    public static String config_dialog_dashboards_label_items;
    public static String config_dialog_dashboards_label_view;
    public static String config_dialog_dashboards_label_legend;
    public static String config_dialog_dashboards_label_grid;
    public static String config_dialog_dashboards_label_domain;
    public static String config_dialog_dashboards_label_range;
    public static String config_dialog_dashboards_label_tip_view;
    public static String config_dialog_dashboards_label_tip_legend;
    public static String config_dialog_dashboards_label_tip_grid;
    public static String config_dialog_dashboards_label_tip_domain;
    public static String config_dialog_dashboards_label_tip_range;
    public static String config_dialog_dashboards_button_configuration;
    public static String config_dialog_dashboards_button_queries;
    public static String config_dialog_dashboards_context;
    
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, UIDashboardMessages.class);
    }

    private UIDashboardMessages() {
    }
}
