cordova.define('cordova/plugin_list', function(require, exports, module) {
module.exports = [
  {
    "id": "cordova.plugin.test.CustomPlugin",
    "file": "plugins/cordova.plugin.test/www/CustomPlugin.js",
    "pluginId": "cordova.plugin.test",
    "clobbers": [
      "cordova.plugins.CustomPlugin"
    ]
  }
];
module.exports.metadata = 
// TOP OF METADATA
{
  "cordova-plugin-whitelist": "1.3.3",
  "cordova.plugin.test": "0.0.2"
};
// BOTTOM OF METADATA
});