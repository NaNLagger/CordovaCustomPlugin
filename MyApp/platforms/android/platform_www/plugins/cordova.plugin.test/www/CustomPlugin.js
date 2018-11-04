cordova.define("cordova.plugin.test.CustomPlugin", function(require, exports, module) {
var exec = require('cordova/exec');

exports.showWebPage = function (url) {
	exec(function() {}, function() {}, 'CustomPlugin', 'showWebPage', [url]);
};
});
