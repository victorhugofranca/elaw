// Overall viewmodel for this screen, along with initial state
function ClienteVM() {
	var self = this;

	self.nbPerPage = 10;
	self.pageNumber = ko.observable(1);
	self.totalPages = ko.observable(0);
	self.totalNumItens = ko.observable(0);

	self.hostUrl = 'http://localhost:8180/elaw/rest';
	self.searchParam = ko.observable();

	self.allFolders = ko.observableArray();

	self.itens = ko.observableArray();

	self.searchService = self.hostUrl + '/clienteservice/search';

	self.removeService = self.hostUrl + '/clienteservice/remove';

	$.getJSON(self.searchService, function(data) {
		self.itens.removeAll();
		for (var i = 0; i < data.length; i++) {
			self.itens.push(data[i]);
		}
	});

}

var clienteVM = new ClienteVM();
ko.applyBindings(clienteVM);