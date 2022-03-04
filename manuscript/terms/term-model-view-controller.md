### Model-View-Controller

Architecture pattern, often used to implement user interfaces. It divides a
system into three interconnected parts (model, view and controller) to separate
the following responsibilities:

  * Model manages data and logic of the system. The "truth" that will be shown or
  displayed by one or many views. Model does not know (depend on) its views.
  * View can be any number of (arbitrary) output representation of (model) information.
  Multiple views of the same model are possible.
  * Controller accepts (user) input and converts those to commands for the model or view.


