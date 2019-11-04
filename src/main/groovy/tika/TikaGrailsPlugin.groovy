package tika


import grails.plugins.Plugin

class TikaGrailsPlugin extends Plugin {

    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "4.0.1 > *"

    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def title = "Tika" // Headline display name of the plugin
    def author = "Dan Stieglitz"
    def authorEmail = "dstieglitz@stainless.ai"
    def description = '''\
This plugin imports Apacke Tika libraries and parsers, and provides a lightweight service for parsing files in 
applications that use this plugin. This is a Grails 4 port of the TikaParser plugin originally written by Ingo Wiarda.
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/tika"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "APACHE"

    // Details of company behind the plugin (if there is one)
    def organization = [name: "Stainless AI", url: "http://stainless.ai/"]

    // Any additional developers beyond the author specified above.
    def developers = [[name: "Ingo Wiarda", email: "ingo_wiarda@dewarim.de"],
                      [name: "Dan Stieglitz", email: "dstieglitz@stainless.ai"]]

    // Location of the plugin's issue tracker.
//    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPMYPLUGIN" ]

    // Online location of the plugin's browseable source code.
    def scm = [url: "http://github.com/stainlessai/grails-tika"]

    Closure doWithSpring() {
        { ->
            // TODO Implement runtime spring config (optional)
        }
    }

    void doWithDynamicMethods() {
        // TODO Implement registering dynamic methods to classes (optional)
    }

    void doWithApplicationContext() {
        // TODO Implement post initialization spring config (optional)
    }

    void onChange(Map<String, Object> event) {
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    void onConfigChange(Map<String, Object> event) {
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    void onShutdown(Map<String, Object> event) {
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
