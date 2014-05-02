// Overall viewmodel for this screen, along with initial state
function ClienteFormVM() {
	var self = this;

	self.cliente = {
		nome : ko.observable("")
	};

	self.hostUrl = 'http://localhost:8180/elaw/rest';

	self.createService = self.hostUrl + '/clienteservice/create';

	self.createRecord = function() {
		$.ajax({
			url : self.createService,
			type : "POST",
			data : ko.toJSON(self.cliente),
			contentType : "application/json; charset=utf-8",
			dataType : "json"
		});
	};

}

var clienteFormVM = new ClienteFormVM();
ko.applyBindings(clienteFormVM);