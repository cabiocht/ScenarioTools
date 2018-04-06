# ScenarioTools
Ensemble d'outils pour la création de scénarios interactifs

## Pour commencer

Ces instructions vont vous permettre d'utiliser l'éditeur de scénario

### Prérequis

Dans un premier temps, il est nécéssaire d'installer Obeo Designer Community et de télécharger le projet ci-joint.

### Installation

Une fois Obeo installé et lancé, il va falloir ouvrir les projets suivants : 
```
ScenarioEditor
ScenarioEditor.edit
ScenarioEditor.editor
ScenarioEditor.tests
```

Ensuite pour créer un nouveau scénario, il faut créer un nouveau "Modeling Project", et y importer le fichier "scenario.odesign" présent dans le dossier EditorSpecifications.

Une fois importé, il est nécéssaire de créer un nouveau Scenario Model, pour cela, avec le Modeling Project que vous avez créé sélectionné, faites : 

nouveau -> other -> Example EMF Model Creation Wizards -> Scenario Model puis Suivant

choisissez alors un nom pour votre scénario et validez, lorsque l'on vous demande de sélectionner un "Model Object" choisissez Scenario et validez de nouveau.

Cela va ainsi créer un fichier "NomDuScenario.scenario", cliquez sur la petite flèche â coté puis sélectionnez Scenario 0, vous pourrea alors commencer à éditer votre scénario.

## Utiliser l'éditeur

Dans un premier temps il est nécéssaire de créer une "représentation" pour chaque composantes d'un scénario pour cela, il faut faire un clic droit sur "Scenario" puis "new Representation".

GameStates

  L'éditeur de GameStates permet de créer l'ensemble des GameStates du scénario.
  Un GameState est un état permettant de représenter l'état global d'un instant donné dans un discours du scénario.
  
  Pour créer un GameState il faut cliquer sur State dans la palette d'édition et le placer dans la zone blanche. Puis pour éditer son     nom et donner une description de ce qu'il représente, il faut utiliser l'onglet "Properties" d'Obeo.
  
GameInputs

  L'éditeur de GameInputs permet de créer l'ensemble des GameInputs du scénario.
  Un GameInput est un état rendu disponible grâce aux interactions au sein du jeu.

  Pour créer un GameInput il faut cliquer sur State dans la palette d'édition et le placer dans la zone blanche. Puis pour éditer son     nom et donner une description de ce qu'il représente, il faut utiliser l'onglet "Properties" d'Obeo.
  
GameMasterInputs

  L'éditeur de GameMasterInputs permet de créer l'ensemble des GameMasterInputs du scénario.
  Un GameMasterInput est un état rendu disponible grâce aux interactions du GameMaster avec l'outil de pilotage.

  Pour créer un GameMasterInput il faut cliquer sur State dans la palette d'édition et le placer dans la zone blanche. Puis pour éditer   son nom et donner une description de ce qu'il représente, il faut utiliser l'onglet "Properties" d'Obeo.
  
Outcomes

  L'éditeur d'Outcomes permet de créer l'ensemble des Outcomes du scénario.
  Un Outcome est un ensemble de GameStates que l'on souhaite voir présents dans une fin du scénario.
  
   Pour créer un Outcome il faut cliquer sur outcome dans la palette d'édition et le placer dans la zone blanche. Puis pour éditer son      nom et donner une description de ce qu'il représente, il faut utiliser l'onglet "Properties" d'Obeo. Ensuite, afin d'ajouter les        états que l'on souhaite voir présent dans cet outcome, il faut cliquer sur "..." et sélectionner le GameState que l'on souhaite          ajouter.
    
EventsActions

  L'éditeur d'EventsActions permet de créer l'ensemble des actions du scénario.
  Un EventAction est une action ayant un temps minimum et maximum de réalisation, un ensemble de préconditions et d'effets, les           préconditions sont des états devant être présents pour qu'elle ait lieu et les effets sont les états créés par celle ci.
  De plus une action est consommée lorsqu'elle à lieu, ainsi, lors d'un discours, elle ne peux pas avoir lieux plus d'une fois.
  
  Pour créer un EventAction il faut sélectionner eventAction dans la palette d'édition et le placer dans la zone blanche, il est alors possible d'éditer son nom et sa description dans l'onglet "Properties" d'Obeo. Puis ensuite il est possible d'ajouter un ensemble de préconditions et d'effets dans l'eventAction.
  
  Une précondition est un ensemble de règles à vérifier pour savoir si l'action est réalisable ou non, elle sert à vérifier si un état  est présent ou non et si celui ci est consommé lors de l'action ou non. Ces paramètres doivent être édité dans l'onglet "Properties" d'Obeo.
  
  Un effet est un ensemble d'états créés lorsque l'action est réalisée. Ces paramètres doivent être édité dans l'onglet "Properties" d'Obeo. Un effet permet de créer un état "normal" qui peut, ou non être consommé, qui "doit" être consommé, ou qui devient infini, c'est à dire qu'il devient toujours présent et qu'il ne peut plus être consommé.
  
Choices

  L'éditeur de choix permet de créer l'ensemble des choix du scénario.
  Un Choix représente un choix du joueur entre 2 ou plusieurs actions à faire, une fois choisi l'ensemble des actions du choix sont       consommés.
  
  Pour créer un choix, il faut sélectionner Choice dans la palette d'édition puis le placer dans la zone blanche, il est alors possible d'éditer sa description dans l'onglet "Properties" d'Obeo, un choix est constitué d'un ensemble de possibilités, créés grâce à l'outil "possibility", ensuite chaque possibilité doit être raccrochée à un EventAction grâce à l'outil ChoicePossibilityConnection ou en sélectionnant directement l'EventAction en cliquant sur "..." à côté de la propriété "Possibility Event Action Connection" de l'onglet "Properties" d'Obeo.
