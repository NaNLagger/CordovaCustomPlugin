var exec = require('cordova/exec');

exports.showWebPage = function (url) {
	exec(function() {}, function() {}, 'CustomPlugin', 'showWebPage', [url]);
};