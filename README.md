
 <h2 centre>Proyecto practico de la catedra de Diseño de Sistemas. AGOSTO-2020 </h2>
 
 ## Sistema de logistica para una empresa de transporte
    Esquema de rutas y plantas basados en un grafo bidirecional con peso.
    Trabajo Grupal de 3 integrantes.
    Se aplicaron fundamentos de POO y programacion funcional.
    Se implemento testeo de los metodos principales.
    Excepciones personalizadas.
    Post relevamiento, analisis y diseño del proyecto: Creacion de la base de datos y del entorno productivo basandonos en un esquema de 3 capaz.
    
 
 <b>Mi rol</b> principal fue implementar toda la logica de negocios pero especialmente la logica de eleccion de mejor camino en un Grafo n-ario con Peso untilizando el <b>algoritmo de dijkstra.</b>

Stack Tenologico:
    swing, Java, Hibernet, mariaDb, Junit


Modo de Uso:
    
    1) Ejecutar InicializacionEstadoPedido. Crea las entidades EstadoPedido. Verificar en BD que los ID sean: 1,2,3,4 o el programa fallará
    2) Ejecutar View/gui/app/App.java. 
    
    Consideraciones:
    
        -Tanto TestGrafo como TestPedido tienen una llamada a un método que permite crear un grafo. Dicha linea está comentada. Si se ejecuta esta clase con 
        dicha linea descomentada, se creará en la BD el grafo. Pero, para volver a ejecutar dicho TestGrafo, debe comentarse de nuevo o 
        arrojará error. 
        
        -La aplicación maneja un solo grafo en todo el tiempo. Es decir, al agregar una planta, se agrega a un grafo ya existente, o en caso de no 
        existir, se crea uno desde cero. Pero siempre es un grafo. 
        
        
        
         
        

    
