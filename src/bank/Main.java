package bank;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.Timer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.awt.Color;
import java.awt.Font;
import com.anylogic.engine.connectivity.ResultSet;
import com.anylogic.engine.connectivity.Statement;
import com.anylogic.engine.elements.*;
import com.anylogic.engine.markup.Network;
import com.anylogic.engine.Position;
import com.anylogic.engine.markup.PedFlowStatistics;
import com.anylogic.engine.markup.DensityMap;


import static java.lang.Math.*;
import static com.anylogic.engine.UtilitiesArray.*;
import static com.anylogic.engine.UtilitiesCollection.*;
import static com.anylogic.engine.presentation.UtilitiesColor.*;
import static com.anylogic.engine.HyperArray.*;

import com.anylogic.engine.*;
import com.anylogic.engine.analysis.*;
import com.anylogic.engine.connectivity.*;
import com.anylogic.engine.database.*;
import com.anylogic.engine.gis.*;
import com.anylogic.engine.markup.*;
import com.anylogic.engine.routing.*;
import com.anylogic.engine.presentation.*;
import com.anylogic.engine.gui.*;

import com.anylogic.libraries.modules.markup_descriptors.*;
import com.anylogic.libraries.processmodeling.*;

import java.awt.geom.Arc2D;

 

public class Main extends Agent
{
  // Parameters
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Main.class );
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    return elementDesciptors_xjal;
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale( 10.0 );

  @Override
  public Scale getScale() {
    return scale;
  }


  // Events
	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _waitTimeDistr_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _timeInSystemDistr_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _atmUtilizationChart_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _queuLengthChart_autoUpdateEvent_xjal = new EventTimeout(this);

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( EventTimeout _e ) {
     if( _e == _waitTimeDistr_autoUpdateEvent_xjal ) return "waitTimeDistr auto update event";
     if( _e == _timeInSystemDistr_autoUpdateEvent_xjal ) return "timeInSystemDistr auto update event";
     if( _e == _atmUtilizationChart_autoUpdateEvent_xjal ) return "atmUtilizationChart auto update event";
     if( _e == _queuLengthChart_autoUpdateEvent_xjal ) return "queuLengthChart auto update event";
    return super.getNameOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public EventTimeout.Mode getModeOf( EventTimeout _e ) {
    if ( _e == _waitTimeDistr_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _timeInSystemDistr_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _atmUtilizationChart_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _queuLengthChart_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    return super.getModeOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double getFirstOccurrenceTime( EventTimeout _e ) {
    double _t;
    if ( _e == _waitTimeDistr_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, MINUTE );
      return _t;
    }
    if ( _e == _timeInSystemDistr_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, MINUTE );
      return _t;
    }
    if ( _e == _atmUtilizationChart_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, MINUTE );
      return _t;
    }
    if ( _e == _queuLengthChart_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, MINUTE );
      return _t;
    }
    return super.getFirstOccurrenceTime( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf( EventTimeout _e ) {
    double _t;
    if( _e == _waitTimeDistr_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, MINUTE );
      return _t;
    }
    if( _e == _timeInSystemDistr_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, MINUTE );
      return _t;
    }
    if( _e == _atmUtilizationChart_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, MINUTE );
      return _t;
    }
    if( _e == _queuLengthChart_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, MINUTE );
      return _t;
    }
    return super.evaluateTimeoutOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( EventTimeout _e ) {
    if ( _e == _waitTimeDistr_autoUpdateEvent_xjal ) {
      waitTimeDistr.update();
      return;
    }
    if ( _e == _timeInSystemDistr_autoUpdateEvent_xjal ) {
      timeInSystemDistr.update();
      return;
    }
    if ( _e == _atmUtilizationChart_autoUpdateEvent_xjal ) {
      atmUtilizationChart.updateData();
      return;
    }
    if ( _e == _queuLengthChart_autoUpdateEvent_xjal ) {
      queuLengthChart.updateData();
      return;
    }
    super.executeActionOf( _e );
  }

	

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 0;


  // Stub function for code completion support (internal)
  @AnyLogicInternalCodegenAPI
  private void _stubForCodeCompletion_xjal(){
    {double _t = 
0 
;}
    {double _t = 
1 
;}
    class _Stub_Implements_xjal implements 
  {}
    class _Stub_Extends_xjal extends 
  {}
  }

  // Embedded Objects

 
  public com.anylogic.libraries.processmodeling.Source<
Customer 
> source;
 
  public com.anylogic.libraries.processmodeling.Queue<
Customer 
> queue;
 
  public com.anylogic.libraries.processmodeling.Delay<
Customer 
> ATM;
 
  public com.anylogic.libraries.processmodeling.Sink<
Customer 
> sink;
 
  public com.anylogic.libraries.processmodeling.Service<
Customer 
> service;
 
  public com.anylogic.libraries.processmodeling.SelectOutput<
Customer 
> selectOutput;
 
  public com.anylogic.libraries.processmodeling.ResourcePool<
Teller 
> tellers;

  public String getNameOf( Agent ao ) {
    if ( ao == source ) return "source";
    if ( ao == queue ) return "queue";
    if ( ao == ATM ) return "ATM";
    if ( ao == sink ) return "sink";
    if ( ao == service ) return "service";
    if ( ao == selectOutput ) return "selectOutput";
    if ( ao == tellers ) return "tellers";
    return super.getNameOf( ao );
  }

  public AgentAnimationSettings getAnimationSettingsOf( Agent ao ) {
    return super.getAnimationSettingsOf( ao );
  }


  public String getNameOf( AgentList<?> aolist ) {
    return super.getNameOf( aolist );
  }
  
  public AgentAnimationSettings getAnimationSettingsOf( AgentList<?> aolist ) {
    return super.getAnimationSettingsOf( aolist );
  }


  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Source<Customer> instantiate_source_xjal() {
    com.anylogic.libraries.processmodeling.Source<Customer> _result_xjal = new com.anylogic.libraries.processmodeling.Source<Customer>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code

      @AnyLogicInternalCodegenAPI
      public RateUnits getUnitsForCodeOf_rate() {
        return PER_MINUTE;
      }
      @Override
      public double interarrivalTime(  ) {
        return _source_interarrivalTime_xjal( this );
      }
      @Override
      public double rateExpression( double baseRate ) {
        return _source_rateExpression_xjal( this, baseRate );
      }
      @Override
      public Date arrivalDate(  ) {
        return _source_arrivalDate_xjal( this );
      }
      @Override
      public int entitiesPerArrival(  ) {
        return _source_entitiesPerArrival_xjal( this );
      }
      @Override
      public double locationX( Customer agent ) {
        return _source_locationX_xjal( this, agent );
      }
      @Override
      public double locationY( Customer agent ) {
        return _source_locationY_xjal( this, agent );
      }
      @Override
      public double locationZ( Customer agent ) {
        return _source_locationZ_xjal( this, agent );
      }
      @Override
      public double locationLatitude( Customer agent ) {
        return _source_locationLatitude_xjal( this, agent );
      }
      @Override
      public double locationLongitude( Customer agent ) {
        return _source_locationLongitude_xjal( this, agent );
      }
      @Override
      public String locationGeoPlaceName( Customer agent ) {
        return _source_locationGeoPlaceName_xjal( this, agent );
      }
      @Override
      public INetwork locationNetwork( Customer agent ) {
        return _source_locationNetwork_xjal( this, agent );
      }
      @Override
      public Level locationLevel( Customer agent ) {
        return _source_locationLevel_xjal( this, agent );
      }
      @Override
      public INode locationNode( Customer agent ) {
        return _source_locationNode_xjal( this, agent );
      }
      @Override
      public Attractor locationAttractor( Customer agent ) {
        return _source_locationAttractor_xjal( this, agent );
      }
      @Override
      public double speed( Customer agent ) {
        return _source_speed_xjal( this, agent );
      }
      @Override
      public Agent newEntity(  ) {
        return _source_newEntity_xjal( this );
      }
      @Override
      public boolean changeDimensions( Customer agent ) {
        return _source_changeDimensions_xjal( this, agent );
      }
      @Override
      public double length( Customer agent ) {
        return _source_length_xjal( this, agent );
      }
      @Override
      public double width( Customer agent ) {
        return _source_width_xjal( this, agent );
      }
      @Override
      public double height( Customer agent ) {
        return _source_height_xjal( this, agent );
      }
      @Override
      public AgentList population( Customer agent ) {
        return _source_population_xjal( this, agent );
      }
      @Override
      public void onBeforeArrival(  ) {
        _source_onBeforeArrival_xjal( this );
      }
      @Override
      public void onAtExit( Customer agent ) {
        _source_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Customer agent ) {
        _source_onExit_xjal( this, agent );
      }
      @Override
      public void onDiscard( Customer agent ) {
        _source_onDiscard_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_source_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self, TableInput _t ) {
    self.arrivalType = 
self.RATE 
;
    self.rate = 
.3 
;
    self.rate = PER_MINUTE.convertTo( self.rate, PER_SECOND );
    self.firstArrivalMode = 
self.AFTER_TIMEOUT 
;
    self.firstArrivalTime = 
 
;
    self.rateSchedule = 
 
;
    self.modifyRate = 
false 
;
    self.arrivalSchedule = 
 
;
    self.setAgentParametersFromDB = 
false 
;
    self.databaseTable = 
 
;
    self.multipleEntitiesPerArrival = 
false 
;
    self.limitArrivals = 
false 
;
    self.maxArrivals = 
1000 
;
    self.locationType = 
self.LOCATION_NOT_SPECIFIED 
;
    self.locationXYZInNetwork = 
false 
;
    self.enableCustomStartTime = 
false 
;
    self.startTime = 
 
;
    self.addToCustomPopulation = 
false 
;
    self.pushProtocol = 
true 
;
    self.discardHangingEntities = 
true 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_source_xjal( com.anylogic.libraries.processmodeling.Source<Customer> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Queue<Customer> instantiate_queue_xjal() {
    com.anylogic.libraries.processmodeling.Queue<Customer> _result_xjal = new com.anylogic.libraries.processmodeling.Queue<Customer>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public double priority( Customer agent ) {
        return _queue_priority_xjal( this, agent );
      }
      @Override
      public boolean comparison( Customer agent1, Customer agent2 ) {
        return _queue_comparison_xjal( this, agent1, agent2 );
      }
      @Override
      public double timeout( Customer agent ) {
        return _queue_timeout_xjal( this, agent );
      }
      @Override
      public void onEnter( Customer agent ) {
        _queue_onEnter_xjal( this, agent );
      }
      @Override
      public void onAtExit( Customer agent ) {
        _queue_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Customer agent ) {
        _queue_onExit_xjal( this, agent );
      }
      @Override
      public void onExitTimeout( Customer agent ) {
        _queue_onExitTimeout_xjal( this, agent );
      }
      @Override
      public void onExitPreempted( Customer agent ) {
        _queue_onExitPreempted_xjal( this, agent );
      }
      @Override
      public void onRemove( Customer agent ) {
        _queue_onRemove_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_queue_xjal( final com.anylogic.libraries.processmodeling.Queue<Customer> self, TableInput _t ) {
    self.capacity = 
15 
;
    self.maximumCapacity = 
false 
;
    self.entityLocation = 
path 
;
    self.queuing = 
self.QUEUING_FIFO 
;
    self.enableTimeout = 
false 
;
    self.enablePreemption = 
false 
;
    self.restoreEntityLocationOnExit = 
true 
;
    self.forceStatisticsCollection = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_queue_xjal( com.anylogic.libraries.processmodeling.Queue<Customer> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Delay<Customer> instantiate_ATM_xjal() {
    com.anylogic.libraries.processmodeling.Delay<Customer> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<Customer>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public double delayTime( Customer agent ) {
        return _ATM_delayTime_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTime() {
        return MINUTE;
      }
      @Override
      public void onEnter( Customer agent, double delayTime ) {
        _ATM_onEnter_xjal( this, agent, delayTime );
      }
      @Override
      public void onAtExit( Customer agent ) {
        _ATM_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Customer agent ) {
        _ATM_onExit_xjal( this, agent );
      }
      @Override
      public void onRemove( Customer agent ) {
        _ATM_onRemove_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_ATM_xjal( final com.anylogic.libraries.processmodeling.Delay<Customer> self, TableInput _t ) {
    self.type = 
self.TIMEOUT 
;
    self.capacity = 
1 
;
    self.maximumCapacity = 
false 
;
    self.entityLocation = 
node 
;
    self.pushProtocol = 
false 
;
    self.restoreEntityLocationOnExit = 
true 
;
    self.forceStatisticsCollection = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_ATM_xjal( com.anylogic.libraries.processmodeling.Delay<Customer> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Sink<Customer> instantiate_sink_xjal() {
    com.anylogic.libraries.processmodeling.Sink<Customer> _result_xjal = new com.anylogic.libraries.processmodeling.Sink<Customer>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public void onEnter( Customer agent ) {
        _sink_onEnter_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_sink_xjal( final com.anylogic.libraries.processmodeling.Sink<Customer> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_sink_xjal( com.anylogic.libraries.processmodeling.Sink<Customer> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Service<Customer> instantiate_service_xjal() {
    com.anylogic.libraries.processmodeling.Service<Customer> _result_xjal = new com.anylogic.libraries.processmodeling.Service<Customer>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool[][] resourceSets( Customer agent ) {
        return _service_resourceSets_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool resourcePool( Customer agent ) {
        return _service_resourcePool_xjal( this, agent );
      }
      @Override
      public int resourceQuantity( Customer agent ) {
        return _service_resourceQuantity_xjal( this, agent );
      }
      @Override
      public double delayTime( Customer agent ) {
        return _service_delayTime_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTime() {
        return MINUTE;
      }
      @Override
      public boolean sendResources( Customer agent, Agent unit ) {
        return _service_sendResources_xjal( this, agent, unit );
      }
      @Override
      public INode destinationNode( Customer agent, Agent unit ) {
        return _service_destinationNode_xjal( this, agent, unit );
      }
      @Override
      public Attractor destinationAttractor( Customer agent, Agent unit ) {
        return _service_destinationAttractor_xjal( this, agent, unit );
      }
      @Override
      public boolean movingGoHome( Agent agent, Agent unit ) {
        return _service_movingGoHome_xjal( this, agent, unit );
      }
      @Override
      public double priority( Customer agent ) {
        return _service_priority_xjal( this, agent );
      }
      @Override
      public boolean taskMayPreemptOtherTasks( Customer agent ) {
        return _service_taskMayPreemptOtherTasks_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.TaskPreemptionPolicy taskPreemptionPolicy( Customer agent ) {
        return _service_taskPreemptionPolicy_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.Enter terminatedTasksEnter( Customer agent, Agent unit ) {
        return _service_terminatedTasksEnter_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.WrapUpPolicy wrapUpTaskPolicyType( Customer agent, Agent unit ) {
        return _service_wrapUpTaskPolicyType_xjal( this, agent, unit );
      }
      @Override
      public double wrapUpTaskPriority( Customer agent, Agent unit ) {
        return _service_wrapUpTaskPriority_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy wrapUpTaskPreemptionPolicy( Customer agent, Agent unit ) {
        return _service_wrapUpTaskPreemptionPolicy_xjal( this, agent, unit );
      }
      @Override
      public boolean resourceChoiceCondition( Customer agent, Agent unit, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _service_resourceChoiceCondition_xjal( this, agent, unit, pool );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceSelectionMode resourceSelectionMode( Customer agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _service_resourceSelectionMode_xjal( this, agent, pool );
      }
      @Override
      public double resourceRating( Agent unit, Customer agent ) {
        return _service_resourceRating_xjal( this, unit, agent );
      }
      @Override
      public boolean resourceComparison( Agent unit1, Agent unit2, Customer agent ) {
        return _service_resourceComparison_xjal( this, unit1, unit2, agent );
      }
      @Override
      public double timeout( Customer agent ) {
        return _service_timeout_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState wrapUpUsageState( Customer agent, Agent unit ) {
        return _service_wrapUpUsageState_xjal( this, agent, unit );
      }
      @Override
      public void onEnter( Customer agent ) {
        _service_onEnter_xjal( this, agent );
      }
      @Override
      public void onExitTimeout( Customer agent ) {
        _service_onExitTimeout_xjal( this, agent );
      }
      @Override
      public void onExitPreempted( Customer agent ) {
        _service_onExitPreempted_xjal( this, agent );
      }
      @Override
      public void onSeizeUnit( Customer agent, Agent unit ) {
        _service_onSeizeUnit_xjal( this, agent, unit );
      }
      @Override
      public void onEnterDelay( Customer agent, double delayTime ) {
        _service_onEnterDelay_xjal( this, agent, delayTime );
      }
      @Override
      public void onAtExit( Customer agent ) {
        _service_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Customer agent ) {
        _service_onExit_xjal( this, agent );
      }
      @Override
      public void onTaskTerminated( Customer agent, Agent unit ) {
        _service_onTaskTerminated_xjal( this, agent, unit );
      }
      @Override
      public void onTaskSuspended( Customer agent, Agent unit ) {
        _service_onTaskSuspended_xjal( this, agent, unit );
      }
      @Override
      public void onTaskResumed( Customer agent, Agent unit ) {
        _service_onTaskResumed_xjal( this, agent, unit );
      }
      @Override
      public void onRemove( Customer agent ) {
        _service_onRemove_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_service_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, TableInput _t ) {
    self.seizeFromOnePool = 
true 
;
    self.queueCapacity = 
20 
;
    self.maximumCapacity = 
false 
;
    self.destinationType = 
self.DEST_ENTITY 
;
    self.entityLocationQueue = 
waitingArea 
;
    self.entityLocationDelay = 
customerPlaces 
;
    self.suspendResumeEntities = 
true 
;
    self.customizeResourceChoice = 
false 
;
    self.enableTimeout = 
false 
;
    self.enablePreemption = 
false 
;
    self.restoreEntityLocationOnExit = 
true 
;
    self.forceStatisticsCollection = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_service_xjal( com.anylogic.libraries.processmodeling.Service<Customer> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.SelectOutput<Customer> instantiate_selectOutput_xjal() {
    com.anylogic.libraries.processmodeling.SelectOutput<Customer> _result_xjal = new com.anylogic.libraries.processmodeling.SelectOutput<Customer>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public boolean condition( Customer agent ) {
        return _selectOutput_condition_xjal( this, agent );
      }
      @Override
      public double probability( Customer agent ) {
        return _selectOutput_probability_xjal( this, agent );
      }
      @Override
      public void onEnter( Customer agent ) {
        _selectOutput_onEnter_xjal( this, agent );
      }
      @Override
      public void onExitTrue( Customer agent ) {
        _selectOutput_onExitTrue_xjal( this, agent );
      }
      @Override
      public void onExitFalse( Customer agent ) {
        _selectOutput_onExitFalse_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_selectOutput_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Customer> self, TableInput _t ) {
    self.conditionIsProbabilistic = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_selectOutput_xjal( com.anylogic.libraries.processmodeling.SelectOutput<Customer> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.ResourcePool<Teller> instantiate_tellers_xjal() {
    com.anylogic.libraries.processmodeling.ResourcePool<Teller> _result_xjal = new com.anylogic.libraries.processmodeling.ResourcePool<Teller>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public int capacityOnValue(  ) {
        return _tellers_capacityOnValue_xjal( this );
      }
      @Override
      public Agent newUnit(  ) {
        return _tellers_newUnit_xjal( this );
      }
      @Override
      public double initialTimeToMaintenance( Teller unit ) {
        return _tellers_initialTimeToMaintenance_xjal( this, unit );
      }
      @Override
      public double timeBetweenMaintenances( Teller unit ) {
        return _tellers_timeBetweenMaintenances_xjal( this, unit );
      }
      @Override
      public double maintenanceTaskPriority( Teller unit ) {
        return _tellers_maintenanceTaskPriority_xjal( this, unit );
      }
      @Override
      public boolean maintenanceTaskMayPreemptOtherTasks( Teller unit ) {
        return _tellers_maintenanceTaskMayPreemptOtherTasks_xjal( this, unit );
      }
      @Override
      public double maintenanceTime( Teller unit ) {
        return _tellers_maintenanceTime_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceTaskStart maintenanceTaskStart( Teller unit ) {
        return _tellers_maintenanceTaskStart_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState maintenanceUsageState( Teller unit ) {
        return _tellers_maintenanceUsageState_xjal( this, unit );
      }
      @Override
      public double initialTimeToFailure( Teller unit ) {
        return _tellers_initialTimeToFailure_xjal( this, unit );
      }
      @Override
      public double timeBetweenFailures( Teller unit ) {
        return _tellers_timeBetweenFailures_xjal( this, unit );
      }
      @Override
      public double repairTime( Teller unit ) {
        return _tellers_repairTime_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceTaskStart repairTaskStart( Teller unit ) {
        return _tellers_repairTaskStart_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState repairUsageState( Teller unit ) {
        return _tellers_repairUsageState_xjal( this, unit );
      }
      @Override
      public double breakTaskPriority( Teller unit ) {
        return _tellers_breakTaskPriority_xjal( this, unit );
      }
      @Override
      public boolean breakTaskMayPreemptOtherTasks( Teller unit ) {
        return _tellers_breakTaskMayPreemptOtherTasks_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy breakTaskPreemptionPolicy( Teller unit ) {
        return _tellers_breakTaskPreemptionPolicy_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState breakUsageState( Teller unit ) {
        return _tellers_breakUsageState_xjal( this, unit );
      }
      @Override
      public double endOfShiftTaskPriority( Teller unit ) {
        return _tellers_endOfShiftTaskPriority_xjal( this, unit );
      }
      @Override
      public boolean endOfShiftTaskMayPreemptOtherTasks( Teller unit ) {
        return _tellers_endOfShiftTaskMayPreemptOtherTasks_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy endOfShiftTaskPreemptionPolicy( Teller unit ) {
        return _tellers_endOfShiftTaskPreemptionPolicy_xjal( this, unit );
      }
      @Override
      public boolean requestChoiceCondition( Teller unit, Agent agent ) {
        return _tellers_requestChoiceCondition_xjal( this, unit, agent );
      }
      @Override
      public AgentList population( Teller unit ) {
        return _tellers_population_xjal( this, unit );
      }
      @Override
      public void onNewUnit( Teller unit ) {
        _tellers_onNewUnit_xjal( this, unit );
      }
      @Override
      public void onDestroyUnit( Teller unit ) {
        _tellers_onDestroyUnit_xjal( this, unit );
      }
      @Override
      public void onSeize( Teller unit, Agent agent ) {
        _tellers_onSeize_xjal( this, unit, agent );
      }
      @Override
      public void onRelease( Teller unit, Agent agent ) {
        _tellers_onRelease_xjal( this, unit, agent );
      }
      @Override
      public void onWrapUp( Teller unit, Agent agent ) {
        _tellers_onWrapUp_xjal( this, unit, agent );
      }
      @Override
      public void onUnitStateChange( Teller unit, boolean busy, com.anylogic.libraries.processmodeling.ResourceTaskType type, Agent agent, com.anylogic.libraries.processmodeling.Downtime task ) {
        _tellers_onUnitStateChange_xjal( this, unit, busy, type, agent, task );
      }
      @Override
      public void onMaintenanceStart( Teller unit ) {
        _tellers_onMaintenanceStart_xjal( this, unit );
      }
      @Override
      public void onMaintenanceEnd( Teller unit ) {
        _tellers_onMaintenanceEnd_xjal( this, unit );
      }
      @Override
      public void onFailure( Teller unit ) {
        _tellers_onFailure_xjal( this, unit );
      }
      @Override
      public void onRepair( Teller unit ) {
        _tellers_onRepair_xjal( this, unit );
      }
      @Override
      public void onBreakStart( Teller unit ) {
        _tellers_onBreakStart_xjal( this, unit );
      }
      @Override
      public void onBreakEnd( Teller unit ) {
        _tellers_onBreakEnd_xjal( this, unit );
      }
      @Override
      public void onBreakTerminated( Teller unit ) {
        _tellers_onBreakTerminated_xjal( this, unit );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_tellers_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, TableInput _t ) {
    self.type = 
self.RESOURCE_MOVING 
;
    self.capacityDefinitionType = 
self.CAPACITY_DIRECT 
;
    self.capacity = 
4 
;
    self.capacityBasedOnAttractors = 
true 
;
    self.capacitySchedule = 
 
;
    self.capacityScheduleOnOff = 
 
;
    self.shiftGroupSchedules = 
{} 
;
    self.shiftGroupSizes = 
{} 
;
    self.shiftGroupsPlan = 
 
;
    self.destroyExcessUnits = 
false 
;
    self.speed = 
10 
;
    self.homeNodes = new INode[]
{ tellerPlaces } 
;
    self.showDefaultAnimationStatic = 
true 
;
    self.downtimeSource = 
self.DOWNTIME_LIST 
;
    self.downtimeList = 
 
;
    self.enableMaintenance = 
false 
;
    self.maintenanceType = 
self.MAINTENANCE_DELAY 
;
    self.enableFailuresRepairs = 
false 
;
    self.countBusyOnlyTimeToFailure = 
false 
;
    self.repairType = 
self.REPAIR_DELAY 
;
    self.enableBreaks = 
false 
;
    self.breaksSchedule = 
 
;
    self.enableCustomTasks = 
false 
;
    self.customTasks = 
{} 
;
    self.customizeRequestChoice = 
false 
;
    self.addToCustomPopulation = 
false 
;
    self.forceStatisticsCollection = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_tellers_xjal( com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }

  private double _source_interarrivalTime_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self ) {
    double _value;
    _value = 
exponential( 1 ) 
;
    return _value;
  }
  private double _source_rateExpression_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self, double baseRate ) {
    double _value;
    _value = 
baseRate 
;
    return _value;
  }
  private Date _source_arrivalDate_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self ) {
    Date _value;
    _value = 
null 
;
    return _value;
  }
  private int _source_entitiesPerArrival_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self ) {
    int _value;
    _value = 
uniform_discr(3, 5) 
;
    return _value;
  }
  private double _source_locationX_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self, Customer agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _source_locationY_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self, Customer agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _source_locationZ_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self, Customer agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _source_locationLatitude_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self, Customer agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _source_locationLongitude_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self, Customer agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private String _source_locationGeoPlaceName_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self, Customer agent ) {
    String _value;
    _value = 
 
;
    return _value;
  }
  private INetwork _source_locationNetwork_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self, Customer agent ) {
    INetwork _value;
    _value = 
 
;
    return _value;
  }
  private Level _source_locationLevel_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self, Customer agent ) {
    Level _value;
    _value = 
 
;
    return _value;
  }
  private INode _source_locationNode_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self, Customer agent ) {
    INode _value;
    _value = 
 
;
    return _value;
  }
  private Attractor _source_locationAttractor_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self, Customer agent ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private double _source_speed_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self, Customer agent ) {
    double _value;
    _value = 
10 
;
    return _value;
  }
  private Agent _source_newEntity_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self ) {
    Agent _value;
    _value = 
new bank.Customer() 
;
    return _value;
  }
  private boolean _source_changeDimensions_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self, Customer agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _source_length_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self, Customer agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _source_width_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self, Customer agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _source_height_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self, Customer agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private AgentList _source_population_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self, Customer agent ) {
    AgentList _value;
    _value = 
 
;
    return _value;
  }
  private void _source_onBeforeArrival_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self ) {
    
 
;
  }
  private void _source_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self, Customer agent ) {
    
 
;
  }
  private void _source_onExit_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self, Customer agent ) {
    
agent.enteredSystem = time(); 
;
  }
  private void _source_onDiscard_xjal( final com.anylogic.libraries.processmodeling.Source<Customer> self, Customer agent ) {
    
 
;
  }
  private double _queue_priority_xjal( final com.anylogic.libraries.processmodeling.Queue<Customer> self, Customer agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _queue_comparison_xjal( final com.anylogic.libraries.processmodeling.Queue<Customer> self, Customer agent1, Customer agent2 ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _queue_timeout_xjal( final com.anylogic.libraries.processmodeling.Queue<Customer> self, Customer agent ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private void _queue_onEnter_xjal( final com.anylogic.libraries.processmodeling.Queue<Customer> self, Customer agent ) {
    
agent.startWaiting = time(); 
;
  }
  private void _queue_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Queue<Customer> self, Customer agent ) {
    
 
;
  }
  private void _queue_onExit_xjal( final com.anylogic.libraries.processmodeling.Queue<Customer> self, Customer agent ) {
    
waitTimeDistr.add(time() - agent.startWaiting); 
;
  }
  private void _queue_onExitTimeout_xjal( final com.anylogic.libraries.processmodeling.Queue<Customer> self, Customer agent ) {
    
 
;
  }
  private void _queue_onExitPreempted_xjal( final com.anylogic.libraries.processmodeling.Queue<Customer> self, Customer agent ) {
    
 
;
  }
  private void _queue_onRemove_xjal( final com.anylogic.libraries.processmodeling.Queue<Customer> self, Customer agent ) {
    
 
;
  }
  private double _ATM_delayTime_xjal( final com.anylogic.libraries.processmodeling.Delay<Customer> self, Customer agent ) {
    double _value;
    _value = 
triangular( 0.8, 1.5, 3.5 ) 
;
    _value = MINUTE.convertTo( _value, SECOND );
    return _value;
  }
  private void _ATM_onEnter_xjal( final com.anylogic.libraries.processmodeling.Delay<Customer> self, Customer agent, double delayTime ) {
    
 
;
  }
  private void _ATM_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Delay<Customer> self, Customer agent ) {
    
 
;
  }
  private void _ATM_onExit_xjal( final com.anylogic.libraries.processmodeling.Delay<Customer> self, Customer agent ) {
    
 
;
  }
  private void _ATM_onRemove_xjal( final com.anylogic.libraries.processmodeling.Delay<Customer> self, Customer agent ) {
    
 
;
  }
  private void _sink_onEnter_xjal( final com.anylogic.libraries.processmodeling.Sink<Customer> self, Customer agent ) {
    
timeInSystemDistr.add(time() - agent.enteredSystem); 
;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool[][] _service_resourceSets_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool[][] _value;
    _value = 
{{}} 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool _service_resourcePool_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
tellers 
;
    return _value;
  }
  private int _service_resourceQuantity_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent ) {
    int _value;
    _value = 
1 
;
    return _value;
  }
  private double _service_delayTime_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent ) {
    double _value;
    _value = 
triangular( 2.5, 6, 11 ) 
;
    _value = MINUTE.convertTo( _value, SECOND );
    return _value;
  }
  private boolean _service_sendResources_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private INode _service_destinationNode_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent, Agent unit ) {
    INode _value;
    _value = 
 
;
    return _value;
  }
  private Attractor _service_destinationAttractor_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent, Agent unit ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private boolean _service_movingGoHome_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Agent agent, Agent unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private double _service_priority_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _service_taskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.TaskPreemptionPolicy _service_taskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent ) {
    com.anylogic.libraries.processmodeling.TaskPreemptionPolicy _value;
    _value = 
self.PP_NO_PREEMPTION 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.Enter _service_terminatedTasksEnter_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.Enter _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.WrapUpPolicy _service_wrapUpTaskPolicyType_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.WrapUpPolicy _value;
    _value = 
self.WRAP_UP_ALWAYS 
;
    return _value;
  }
  private double _service_wrapUpTaskPriority_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent, Agent unit ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _service_wrapUpTaskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _value;
    _value = 
self.WPP_NO_PREEMPTION 
;
    return _value;
  }
  private boolean _service_resourceChoiceCondition_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent, Agent unit, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceSelectionMode _service_resourceSelectionMode_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    com.anylogic.libraries.processmodeling.ResourceSelectionMode _value;
    _value = 
self.RESOURCE_SELECTION_SOME_UNIT 
;
    return _value;
  }
  private double _service_resourceRating_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Agent unit, Customer agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _service_resourceComparison_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Agent unit1, Agent unit2, Customer agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _service_timeout_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _service_wrapUpUsageState_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_BUSY 
;
    return _value;
  }
  private void _service_onEnter_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent ) {
    
 
;
  }
  private void _service_onExitTimeout_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent ) {
    
 
;
  }
  private void _service_onExitPreempted_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent ) {
    
 
;
  }
  private void _service_onSeizeUnit_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent, Agent unit ) {
    
 
;
  }
  private void _service_onEnterDelay_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent, double delayTime ) {
    
 
;
  }
  private void _service_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent ) {
    
 
;
  }
  private void _service_onExit_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent ) {
    
 
;
  }
  private void _service_onTaskTerminated_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent, Agent unit ) {
    
 
;
  }
  private void _service_onTaskSuspended_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent, Agent unit ) {
    
 
;
  }
  private void _service_onTaskResumed_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent, Agent unit ) {
    
 
;
  }
  private void _service_onRemove_xjal( final com.anylogic.libraries.processmodeling.Service<Customer> self, Customer agent ) {
    
 
;
  }
  private boolean _selectOutput_condition_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Customer> self, Customer agent ) {
    boolean _value;
    _value = 
randomTrue( 0.5 ) 
;
    return _value;
  }
  private double _selectOutput_probability_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Customer> self, Customer agent ) {
    double _value;
    _value = 
0.5 
;
    return _value;
  }
  private void _selectOutput_onEnter_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Customer> self, Customer agent ) {
    
 
;
  }
  private void _selectOutput_onExitTrue_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Customer> self, Customer agent ) {
    
 
;
  }
  private void _selectOutput_onExitFalse_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Customer> self, Customer agent ) {
    
 
;
  }
  private int _tellers_capacityOnValue_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self ) {
    int _value;
    _value = 
1 
;
    return _value;
  }
  private Agent _tellers_newUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self ) {
    Agent _value;
    _value = 
new bank.Teller() 
;
    return _value;
  }
  private double _tellers_initialTimeToMaintenance_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    double _value;
    _value = 
uniform( 0, 1000 ) 
;
    return _value;
  }
  private double _tellers_timeBetweenMaintenances_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    double _value;
    _value = 
triangularAV( 1000, 0.1 ) 
;
    return _value;
  }
  private double _tellers_maintenanceTaskPriority_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private boolean _tellers_maintenanceTaskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _tellers_maintenanceTime_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    double _value;
    _value = 
triangular(10, 20, 30) 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceTaskStart _tellers_maintenanceTaskStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    com.anylogic.libraries.processmodeling.ResourceTaskStart _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _tellers_maintenanceUsageState_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_NOT_COUNTED 
;
    return _value;
  }
  private double _tellers_initialTimeToFailure_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    double _value;
    _value = 
uniform( 0, 1000 ) 
;
    return _value;
  }
  private double _tellers_timeBetweenFailures_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    double _value;
    _value = 
triangularAV( 1000, 0.1 ) 
;
    return _value;
  }
  private double _tellers_repairTime_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    double _value;
    _value = 
triangularAV( 10, 0.1 ) 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceTaskStart _tellers_repairTaskStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    com.anylogic.libraries.processmodeling.ResourceTaskStart _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _tellers_repairUsageState_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_NOT_COUNTED 
;
    return _value;
  }
  private double _tellers_breakTaskPriority_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    double _value;
    _value = 
50 
;
    return _value;
  }
  private boolean _tellers_breakTaskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _tellers_breakTaskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _value;
    _value = 
self.PP_TERMINATE 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _tellers_breakUsageState_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_NOT_COUNTED 
;
    return _value;
  }
  private double _tellers_endOfShiftTaskPriority_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private boolean _tellers_endOfShiftTaskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _tellers_endOfShiftTaskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _value;
    _value = 
self.PP_NO_PREEMPTION 
;
    return _value;
  }
  private boolean _tellers_requestChoiceCondition_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit, Agent agent ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private AgentList _tellers_population_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    AgentList _value;
    _value = 
 
;
    return _value;
  }
  private void _tellers_onNewUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    
 
;
  }
  private void _tellers_onDestroyUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    
 
;
  }
  private void _tellers_onSeize_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit, Agent agent ) {
    
 
;
  }
  private void _tellers_onRelease_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit, Agent agent ) {
    
 
;
  }
  private void _tellers_onWrapUp_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit, Agent agent ) {
    
 
;
  }
  private void _tellers_onUnitStateChange_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit, boolean busy, com.anylogic.libraries.processmodeling.ResourceTaskType type, Agent agent, com.anylogic.libraries.processmodeling.Downtime task ) {
    
 
;
  }
  private void _tellers_onMaintenanceStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    
 
;
  }
  private void _tellers_onMaintenanceEnd_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    
 
;
  }
  private void _tellers_onFailure_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    
 
;
  }
  private void _tellers_onRepair_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    
 
;
  }
  private void _tellers_onBreakStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    
 
;
  }
  private void _tellers_onBreakEnd_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    
 
;
  }
  private void _tellers_onBreakTerminated_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Teller> self, Teller unit ) {
    
 
;
  }
  // Analysis Data Elements
  public HistogramSmartData waitTimeDistr = new HistogramSmartData( 50, 
0.01 
, true, false, 0.1, 0.1, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( HistogramData _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( _waitTimeDistr_Value() );
      _lastUpdateX = time();
    }
  } );
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _waitTimeDistr_Value() {
    return 
 
;
  }
  
  public HistogramSmartData timeInSystemDistr = new HistogramSmartData( 50, 
0.01 
, true, false, 0.1, 0.1, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( HistogramData _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( _timeInSystemDistr_Value() );
      _lastUpdateX = time();
    }
  } );
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _timeInSystemDistr_Value() {
    return 
 
;
  }
  
  // View areas
  public ViewArea _origin_VA = new ViewArea( this, "[Origin]", 0, 0, 1000.0, 600.0 );
  @AnyLogicInternalCodegenAPI
  public ViewArea _window3d_VA = new ViewArea( this, "[window3d]", 0.0, 710.0, 500.0, 300.0 );
  @Override
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if ( _output != null ) {
      _output.put( "_origin_VA", this._origin_VA );
      _output.put( "_window3d_VA", this._window3d_VA );
    }
    return 2 + super.getViewAreas( _output );
  }
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _atm_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "Material_(1)_Surf", null ),
    new Pair<String, Color>( "Material_(2)_Surf", null ),
    new Pair<String, Color>( "Material_(4)_Surf", null ),
    new Pair<String, Color>( "Material_(3)_Surf", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _table_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "material0", null ),
    new Pair<String, Color>( "material1", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _table1_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "material0", null ),
    new Pair<String, Color>( "material1", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _table2_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "material0", null ),
    new Pair<String, Color>( "material1", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _table3_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "material0", null ),
    new Pair<String, Color>( "material1", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final int _window3d = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _atmUtilizationChart = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int _queuLengthChart = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int _chart = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int _chart1 = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int _atm = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int _table = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int _table1 = 8;
  @AnyLogicInternalCodegenAPI
  protected static final int _table2 = 9;
  @AnyLogicInternalCodegenAPI
  protected static final int _table3 = 10;
  @AnyLogicInternalCodegenAPI
  protected static final int _path = 11;
  @AnyLogicInternalCodegenAPI
  protected static final int _node = 12;
  @AnyLogicInternalCodegenAPI
  protected static final int _waitingArea = 13;
  @AnyLogicInternalCodegenAPI
  protected static final int _attractor = 14;
  @AnyLogicInternalCodegenAPI
  protected static final int _attractor1 = 15;
  @AnyLogicInternalCodegenAPI
  protected static final int _attractor2 = 16;
  @AnyLogicInternalCodegenAPI
  protected static final int _attractor3 = 17;
  @AnyLogicInternalCodegenAPI
  protected static final int _customerPlaces = 18;
  @AnyLogicInternalCodegenAPI
  protected static final int _attractor4 = 19;
  @AnyLogicInternalCodegenAPI
  protected static final int _attractor5 = 20;
  @AnyLogicInternalCodegenAPI
  protected static final int _attractor6 = 21;
  @AnyLogicInternalCodegenAPI
  protected static final int _attractor7 = 22;
  @AnyLogicInternalCodegenAPI
  protected static final int _tellerPlaces = 23;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 24;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_network_xjal() {
	  network.addAll(path, node);
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(network, window3d, atm, waitingArea, customerPlaces, tellerPlaces, table, table1, table2, table3, atmUtilizationChart, queuLengthChart, chart, chart1);
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _path_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 20.0, 650.0, 0.0, 70.0, 650.0, 0.0 ),
       new MarkupSegmentLine( 70.0, 650.0, 0.0, 70.0, 600.0, 0.0 ),
       new MarkupSegmentLine( 70.0, 600.0, 0.0, 120.0, 600.0, 0.0 ),
       new MarkupSegmentLine( 120.0, 600.0, 0.0, 120.0, 700.0, 0.0 ),
       new MarkupSegmentLine( 120.0, 700.0, 0.0, 170.0, 700.0, 0.0 ),
       new MarkupSegmentLine( 170.0, 700.0, 0.0, 170.0, 650.0, 0.0 ),
       new MarkupSegmentLine( 170.0, 650.0, 0.0, 220.0, 650.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private Attractor[] _customerPlaces_attractors_xjal() {
    return new Attractor[] {
        attractor, attractor1, attractor2, attractor3, 
    };
  }
  @AnyLogicInternalCodegenAPI
  private Attractor[] _tellerPlaces_attractors_xjal() {
    return new Attractor[] {
        attractor4, attractor5, attractor6, attractor7, 
    };
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onShapeClick( int _shape, int index, double clickx, double clicky ){
    switch( _shape ){
      case _atm:
        if (true) {
          Shape3DObject self = this.atm;
          
 
        }
        break;
      case _table:
        if (true) {
          Shape3DObject self = this.table;
          
 
        }
        break;
      case _table1:
        if (true) {
          Shape3DObject self = this.table1;
          
 
        }
        break;
      case _table2:
        if (true) {
          Shape3DObject self = this.table2;
          
 
        }
        break;
      case _table3:
        if (true) {
          Shape3DObject self = this.table3;
          
 
        }
        break;
      default: return super.onShapeClick( _shape, index, clickx, clicky );
 	}
 	return false;
  }
   
  @Override
  @AnyLogicInternalCodegenAPI
  public void onSelectionChanged_xjal( int _shape, int index, int[] selectedIndices, boolean programmatically ) {
    switch( _shape ) {
      case _atmUtilizationChart: {
        BarChart self = this.atmUtilizationChart;
        
 
;}
        break;
      case _queuLengthChart: {
        BarChart self = this.queuLengthChart;
        
 
;}
        break;
      case _chart: {
        Histogram self = this.chart;
        
 
;}
        break;
      case _chart1: {
        Histogram self = this.chart1;
        
 
;}
        break;
      default:
        super.onSelectionChanged_xjal( _shape, index, selectedIndices, programmatically );
        break;
    }
  }


  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _atmUtilizationChart_DataItem0Value() {
    return 
ATM.statsUtilization.mean() 
;
  }
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _queuLengthChart_DataItem0Value() {
    return 
queue.statsSize.mean() 
;
  }
  // Stub function for code completion support (internal)
  @AnyLogicInternalCodegenAPI
  private void _stubForReplication_xjal() {
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
  }

  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _window3d_SetDynamicParams_xjal( ShapeWindow3D shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
 	}
  }
  
  protected ShapeWindow3D window3d;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _atmUtilizationChart_SetDynamicParams_xjal( BarChart shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setWidth(
 
);
    shape.setHeight(
 
);
 	}
  }
  
  protected BarChart atmUtilizationChart;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _queuLengthChart_SetDynamicParams_xjal( BarChart shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setWidth(
 
);
    shape.setHeight(
 
);
 	}
  }
  
  protected BarChart queuLengthChart;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _chart_SetDynamicParams_xjal( Histogram shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setWidth(
 
);
    shape.setHeight(
 
);
 	}
  }
  
  protected Histogram chart;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _chart1_SetDynamicParams_xjal( Histogram shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setWidth(
 
);
    shape.setHeight(
 
);
 	}
  }
  
  protected Histogram chart1;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _atm_SetDynamicParams_xjal( Shape3DObject shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScale(
 
);
    shape.setRotation(
 
);
 	}
  }
  
  protected Shape3DObject atm;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _table_SetDynamicParams_xjal( Shape3DObject shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScale(
 
);
    shape.setRotation(
 
);
 	}
  }
  
  protected Shape3DObject table;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _table1_SetDynamicParams_xjal( Shape3DObject shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScale(
 
);
    shape.setRotation(
 
);
 	}
  }
  
  protected Shape3DObject table1;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _table2_SetDynamicParams_xjal( Shape3DObject shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScale(
 
);
    shape.setRotation(
 
);
 	}
  }
  
  protected Shape3DObject table2;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _table3_SetDynamicParams_xjal( Shape3DObject shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScale(
 
);
    shape.setRotation(
 
);
 	}
  }
  
  protected Shape3DObject table3;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _path_SetDynamicParams_xjal( Path shape ) {
    shape.setLineColor(
 
);
    shape.setLineWidth(
 
);
  }
  
  protected Path path;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _node_SetDynamicParams_xjal( PointNode shape ) {
    shape.setFillColor(
ATM.size() < 0 ? red : green 
);
  }
  
  protected PointNode node;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _waitingArea_SetDynamicParams_xjal( RectangularNode<Agent> shape ) {
    shape.setLineColor(
 
);
    shape.setFillColor(
 
);
    shape.setLineWidth(
 
);
    shape.setLineStyle(
 
);
  }
  
  protected RectangularNode<Agent> waitingArea;
  protected Attractor attractor;
  protected Attractor attractor1;
  protected Attractor attractor2;
  protected Attractor attractor3;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _customerPlaces_SetDynamicParams_xjal( RectangularNode<Agent> shape ) {
    shape.setLineColor(
 
);
    shape.setFillColor(
 
);
    shape.setLineWidth(
 
);
    shape.setLineStyle(
 
);
  }
  
  protected RectangularNode<Agent> customerPlaces;
  protected Attractor attractor4;
  protected Attractor attractor5;
  protected Attractor attractor6;
  protected Attractor attractor7;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _tellerPlaces_SetDynamicParams_xjal( RectangularNode<Agent> shape ) {
    shape.setLineColor(
 
);
    shape.setFillColor(
 
);
    shape.setLineWidth(
 
);
    shape.setLineStyle(
 
);
  }
  
  protected RectangularNode<Agent> tellerPlaces;
  protected com.anylogic.engine.markup.Network network;

  private INetwork[] _getNetworks_xjal;

  @Override
  public INetwork[] getNetworks() {
    return _getNetworks_xjal;
  }

  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    window3d = new ShapeWindow3D( Main.this, false, 0.0, 710.0, 500.0, 300.0, WINDOW_3D_NAVIGATION_FULL, 2000.0 ) {
      @Override
      public void updateDynamicProperties() {
        _window3d_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    atm = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 220.0, 650.0, 0.0, 0.0,
			1.0, true, "/bank/",
			"3d/atm.dae", OBJECT_3D_YZX_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, 0.0, 0.0,
			1.0, 1.0, null, _atm_customColors_xjal ) {
      @Override
      public void updateDynamicProperties() {
        _atm_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    table = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 188.0, 443.0, 0.0, 4.71238898038469,
			1.2, true, "/bank/",
			"3d/table.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, 0.0, 0.0,
			1.0, 1.0, null, _table_customColors_xjal ) {
      @Override
      public void updateDynamicProperties() {
        _table_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    table1 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 188.0, 477.0, 0.0, 4.71238898038469,
			1.2, true, "/bank/",
			"3d/table.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, 0.0, 0.0,
			1.0, 1.0, null, _table1_customColors_xjal ) {
      @Override
      public void updateDynamicProperties() {
        _table1_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    table2 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 188.0, 511.0, 0.0, 4.71238898038469,
			1.2, true, "/bank/",
			"3d/table.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, 0.0, 0.0,
			1.0, 1.0, null, _table2_customColors_xjal ) {
      @Override
      public void updateDynamicProperties() {
        _table2_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    table3 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 188.0, 547.0, 0.0, 4.71238898038469,
			1.2, true, "/bank/",
			"3d/table.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, 0.0, 0.0,
			1.0, 1.0, null, _table3_customColors_xjal ) {
      @Override
      public void updateDynamicProperties() {
        _table3_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    path = new Path( this, SHAPE_DRAW_2D3D, true, true, false, 10, false, 10, PATH_DASHEDLINE, dodgerBlue, 1.0, _path_segments_xjal() ) {
      @Override
      public void updateDynamicProperties() {
        _path_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    attractor = new Attractor( 30.0, 34.0, 0.0 );

    attractor1 = new Attractor( 30.0, 68.0, 0.0 );

    attractor2 = new Attractor( 30.0, 102.0, 0.0 );

    attractor3 = new Attractor( 30.0, 136.0, 0.0 );

    attractor4 = new Attractor( 30.0, 34.0, 3.141592653589793 );

    attractor5 = new Attractor( 30.0, 68.0, 3.141592653589793 );

    attractor6 = new Attractor( 30.0, 102.0, 3.141592653589793 );

    attractor7 = new Attractor( 30.0, 136.0, 3.141592653589793 );

    node = new PointNode(this, SHAPE_DRAW_2D3D, true, 220.0, 650.0, 0.0, 10.0, dodgerBlue, false, 10.0, new PathEnd[] { new PathEnd(path, PathEndType.END)} ) {
      @Override
      public void updateDynamicProperties() {
        _node_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    waitingArea = new RectangularNode<Agent>( this, SHAPE_DRAW_2D3D, true,
    null, 10.0, 410.0, 0.0, 100.0, 170.0, 0.0,
            null, dodgerBlue, 1.0, LINE_STYLE_DASHED, POSITION_CHOICE_RANDOM, new PathEnd[] {} ) {
      @Override
      public void updateDynamicProperties() {
        _waitingArea_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    customerPlaces = new RectangularNode<Agent>( this, SHAPE_DRAW_2D3D, true,
    null, 110.0, 410.0, 0.0, 60.0, 170.0, 0.0,
            null, dodgerBlue, 1.0, LINE_STYLE_DASHED, POSITION_CHOICE_BY_ATTRACTORS, new PathEnd[] {}, _customerPlaces_attractors_xjal() ) {
      @Override
      public void updateDynamicProperties() {
        _customerPlaces_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    tellerPlaces = new RectangularNode<Agent>( this, SHAPE_DRAW_2D3D, true,
    null, 170.0, 410.0, 0.0, 60.0, 170.0, 0.0,
            null, dodgerBlue, 1.0, LINE_STYLE_DASHED, POSITION_CHOICE_BY_ATTRACTORS, new PathEnd[] {}, _tellerPlaces_attractors_xjal() ) {
      @Override
      public void updateDynamicProperties() {
        _tellerPlaces_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {
    List<DataItem> _items = new ArrayList<DataItem>( 1 );
    _items.add( new DataItem() {
      @Override
      public void update() {
        setValue( _atmUtilizationChart_DataItem0Value() );
      }
    });
    List<String> _titles = new ArrayList<String>( 1 );
    _titles.add( "ATM Utilization" );
    List<Color> _colors = new ArrayList<Color>( 1 );
    _colors.add( mediumTurquoise );
    atmUtilizationChart = new BarChart(
		    Main.this, true, 380.0, 170.0, 
			400.0, 270.0,
            null, null,
            170.0, 50.0,
			60.0, 200.0, white, black, black,
            170.0, Chart.EAST,
            Chart.NORTH, Chart.SCALE_AUTO,
            0, 0, 0.52,
            Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _colors ) {
      @Override
      public void updateDynamicProperties() {
        _atmUtilizationChart_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    }
    {
    List<DataItem> _items = new ArrayList<DataItem>( 1 );
    _items.add( new DataItem() {
      @Override
      public void update() {
        setValue( _queuLengthChart_DataItem0Value() );
      }
    });
    List<String> _titles = new ArrayList<String>( 1 );
    _titles.add( "Queue length:" );
    List<Color> _colors = new ArrayList<Color>( 1 );
    _colors.add( coral );
    queuLengthChart = new BarChart(
		    Main.this, true, 500.0, 430.0, 
			260.0, 210.0,
            null, null,
            50.0, 10.0,
			200.0, 40.0, white, black, black,
            30.0, Chart.NORTH,
            Chart.WEST, Chart.SCALE_AUTO,
            0, 0, 0.8,
            Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _colors ) {
      @Override
      public void updateDynamicProperties() {
        _queuLengthChart_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    }
    {
    HistogramData _item;
    List<HistogramData> _items = new ArrayList<HistogramData>( 1 );
    _item = 
waitTimeDistr 
;
    _items.add( _item ); 
    List<String> _titles = new ArrayList<String>( 1 );
    _titles.add( "Waiting Time Distribution" );
    List<Histogram.Appearance> _appearances = new ArrayList<Histogram.Appearance>( 1 );
    _appearances.add( new Histogram.Appearance( oliveDrab, deepPink, goldenRod, dodgerBlue, 1, darkMagenta ) );
    chart = new Histogram(
		    Main.this, true, 520.0, 710.0, 
			260.0, 210.0,
            null, null,
            50.0, 30.0,
			180.0, 120.0, white, black, black,
            30.0, Chart.SOUTH,
            Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, 
            true, false, false, 0.8,
            _items, _titles, _appearances ) {
      @Override
      public void updateDynamicProperties() {
        _chart_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    }
    {
    HistogramData _item;
    List<HistogramData> _items = new ArrayList<HistogramData>( 1 );
    _item = 
timeInSystemDistr 
;
    _items.add( _item ); 
    List<String> _titles = new ArrayList<String>( 1 );
    _titles.add( "Time in Sytstem Distribution" );
    List<Histogram.Appearance> _appearances = new ArrayList<Histogram.Appearance>( 1 );
    _appearances.add( new Histogram.Appearance( yellowGreen, darkKhaki, darkMagenta, coral, 1, oliveDrab ) );
    chart1 = new Histogram(
		    Main.this, true, 800.0, 710.0, 
			260.0, 210.0,
            null, null,
            50.0, 30.0,
			180.0, 120.0, white, black, black,
            30.0, Chart.SOUTH,
            Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, 
            true, false, false, 0.8,
            _items, _titles, _appearances ) {
      @Override
      public void updateDynamicProperties() {
        _chart1_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    }
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBS0_xjal() {
  }


  // Static initialization of persistent elements
  private void instantiatePersistentElements_xjal() {
    network = new com.anylogic.engine.markup.Network(this, "network", SHAPE_DRAW_2D3D, 0.0, true, true);  			
	_getNetworks_xjal = new INetwork[] { 
      network };
    level = new com.anylogic.engine.markup.Level(this, "level", SHAPE_DRAW_2D3D, 0.0, true, true);  			
	_getLevels_xjal = new com.anylogic.engine.markup.Level[] { 
      level };
    _createPersistentElementsBP0_xjal();
  }
  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeModelElementsGroup icon; 

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeTopLevelPresentationGroup getPresentationShape() {
    return presentation;
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeModelElementsGroup getModelElementsShape() {
    return icon;
  }

	


  @Override
  @AnyLogicInternalCodegenAPI
  public void onArrival() {
    super.onArrival();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onStep() {
    super.onStep();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onBeforeStep() {
    super.onBeforeStep();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onEnterFlowchartBlock(Agent oldBlock, Agent block) {
    super.onEnterFlowchartBlock( oldBlock, block );
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onExitFlowchartBlock(Agent block) {
    super.onExitFlowchartBlock(block);
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onSeizeResource(Agent unit) {
    super.onSeizeResource(unit);
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onReleaseResource(Agent unit) {
    super.onReleaseResource(unit);
    
 
  }

  /**
   * Constructor
   */
  public Main( Engine engine, Agent owner, AgentList<? extends Main> ownerPopulation ) {
    super( engine, owner, ownerPopulation );
    instantiateBaseStructureThis_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void onOwnerChanged_xjal() {
    super.onOwnerChanged_xjal();
    setupReferences_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void instantiateBaseStructure_xjal() {
    super.instantiateBaseStructure_xjal();
    instantiateBaseStructureThis_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void instantiateBaseStructureThis_xjal() {
    source = instantiate_source_xjal();
    queue = instantiate_queue_xjal();
    ATM = instantiate_ATM_xjal();
    sink = instantiate_sink_xjal();
    service = instantiate_service_xjal();
    selectOutput = instantiate_selectOutput_xjal();
    tellers = instantiate_tellers_xjal();
	instantiatePersistentElements_xjal();
    setupReferences_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Main() {
  }
  
  /**
   * Creating embedded object instances
   */
  @AnyLogicInternalCodegenAPI
  private void instantiatePopulations_xjal() {
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Creating embedded object instances
    instantiatePopulations_xjal();
    // Assigning initial values for plain variables
    setupPlainVariables_Main_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_network_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Main.this, true, 0, 0, 0, 0 , level, 
      // default light
      new Light3D.Daylight( null, false, true ) );
    window3d.setCamera( new Camera3D( 171, 829, 300, 0.7853981633974483, -1.5707963267948966 ), false );
    // Creating embedded object instances
    instantiatePopulations_xjal();
    icon = new ShapeModelElementsGroup( Main.this, getElementProperty( "bank.Main.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
    // Creating non-replicated embedded objects
    setupParameters_source_xjal( source, null );
    doBeforeCreate_source_xjal( source, null );
    source.createAsEmbedded();
    setupParameters_queue_xjal( queue, null );
    doBeforeCreate_queue_xjal( queue, null );
    queue.createAsEmbedded();
    setupParameters_ATM_xjal( ATM, null );
    doBeforeCreate_ATM_xjal( ATM, null );
    ATM.createAsEmbedded();
    setupParameters_sink_xjal( sink, null );
    doBeforeCreate_sink_xjal( sink, null );
    sink.createAsEmbedded();
    setupParameters_service_xjal( service, null );
    doBeforeCreate_service_xjal( service, null );
    service.createAsEmbedded();
    setupParameters_selectOutput_xjal( selectOutput, null );
    doBeforeCreate_selectOutput_xjal( selectOutput, null );
    selectOutput.createAsEmbedded();
    setupParameters_tellers_xjal( tellers, null );
    doBeforeCreate_tellers_xjal( tellers, null );
    tellers.createAsEmbedded();
	 // Port connectors with non-replicated objects
    ATM.in.connect( queue.out ); // connector1
    sink.in.connect( ATM.out ); // connector2
    queue.in.connect( selectOutput.outT ); // connector
    selectOutput.in.connect( source.out ); // connector3
    selectOutput.outF.connect( service.in ); // connector4
    service.out.connect( sink.in ); // connector5
    // Creating replicated embedded objects
    setupInitialConditions_xjal( Main.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void setupExt_xjal(AgentExtension _ext) {
    // Agent properties setup
    if ( _ext instanceof ExtAgentWithSpatialMetrics && _ext instanceof ExtWithSpaceType && !(tryExt(ExtAgentWithSpatialMetrics.class) instanceof ExtWithSpaceType) ) {
      double _speed;
      _speed = 
10 
;
      ((ExtAgentWithSpatialMetrics) _ext).setSpeed( _speed, MPS );
    }
    if ( _ext instanceof ExtEntity && tryExt(ExtEntity.class) == null ) {
      ExtEntity _e = (ExtEntity) _ext;
      double _length;
      _length = 
1 
;
	  _e.setLength( _length, METER );
	  double _width;
      _width = 
1 
;
	  _e.setWidth( _width, METER );
	  double _height;
      _height = 
1 
;
	  _e.setHeight( _height, METER );
    }
    if ( _ext instanceof ExtAgentWithSpatialMetrics && tryExt(ExtAgentWithSpatialMetrics.class) == null ) {
      ExtAgentWithSpatialMetrics _e = (ExtAgentWithSpatialMetrics) _ext;
      _e.setAutomaticHorizontalRotation( true );
    }
    if ( _ext instanceof ExtAgentContinuous && tryExt(ExtAgentContinuous.class) == null ) {
      ExtAgentContinuous _e = (ExtAgentContinuous) _ext;
      _e.setAutomaticVerticalRotation( false );
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    _waitTimeDistr_autoUpdateEvent_xjal.start();
    _timeInSystemDistr_autoUpdateEvent_xjal.start();
    _atmUtilizationChart_autoUpdateEvent_xjal.start();
    _queuLengthChart_autoUpdateEvent_xjal.start();
    source.startAsEmbedded();
    queue.startAsEmbedded();
    ATM.startAsEmbedded();
    sink.startAsEmbedded();
    service.startAsEmbedded();
    selectOutput.startAsEmbedded();
    tellers.startAsEmbedded();
  }
 
  @AnyLogicInternalCodegenAPI
  public void onStartup() {
    super.onStartup();
    
 
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Main_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Main_xjal() {
  }

  // User API -----------------------------------------------------
  @AnyLogicInternalCodegenAPI
  public static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl( false, black, 1.0, LINE_STYLE_SOLID, ARROW_NONE, 0.0 );

  public LinkToAgentCollection<Agent, Agent> connections = new LinkToAgentStandardImpl<Agent, Agent>(this, _connections_commonAnimationSettings_xjal);
  @Override
  public LinkToAgentCollection<? extends Agent, ? extends Agent> getLinkToAgentStandard_xjal() {
    return connections;
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public void onReceive( Object _msg_xjal, Agent _sender_xjal ) {
    super.onReceive( _msg_xjal, _sender_xjal );
    
Object  msg = (Object) _msg_xjal;
    Agent sender = _sender_xjal;
    
 
  }



  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public List<Object> getEmbeddedObjects() {
    List<Object> list = super.getEmbeddedObjects();
    if (list == null) {
      list = new LinkedList<Object>();
    }
    list.add( source );
    list.add( queue );
    list.add( ATM );
    list.add( sink );
    list.add( service );
    list.add( selectOutput );
    list.add( tellers );
    return list;
  }

  public AgentList<? extends Main> getPopulation() {
    return (AgentList<? extends Main>) super.getPopulation();
  }

  public List<? extends Main> agentsInRange( double distance ) {
    return (List<? extends Main>) super.agentsInRange( distance );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean isLoggingToDB(EventOriginator _e) {
    if ( _e == _waitTimeDistr_autoUpdateEvent_xjal ) return false;
    if ( _e == _timeInSystemDistr_autoUpdateEvent_xjal ) return false;
    if ( _e == _atmUtilizationChart_autoUpdateEvent_xjal ) return false;
    if ( _e == _queuLengthChart_autoUpdateEvent_xjal ) return false;
    return super.isLoggingToDB( _e );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    _waitTimeDistr_autoUpdateEvent_xjal.onDestroy();
    _timeInSystemDistr_autoUpdateEvent_xjal.onDestroy();
    _atmUtilizationChart_autoUpdateEvent_xjal.onDestroy();
    _queuLengthChart_autoUpdateEvent_xjal.onDestroy();
    source.onDestroy();
    queue.onDestroy();
    ATM.onDestroy();
    sink.onDestroy();
    service.onDestroy();
    selectOutput.onDestroy();
    tellers.onDestroy();
    // On destroy code
    
 
  // Analysis Data Elements
    waitTimeDistr.destroyUpdater_xjal();
    timeInSystemDistr.destroyUpdater_xjal();
    logToDB( waitTimeDistr, "waitTimeDistr" );
    logToDB( timeInSystemDistr, "timeInSystemDistr" );
    super.onDestroy();
  }

  @AnyLogicInternalCodegenAPI
  @Override
  public void doFinish() {
    super.doFinish();
    source.doFinish();
    queue.doFinish();
    ATM.doFinish();
    sink.doFinish();
    service.doFinish();
    selectOutput.doFinish();
    tellers.doFinish();
  }

  // Additional class code

 
  // End of additional class code


}
