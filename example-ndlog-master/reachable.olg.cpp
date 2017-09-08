materialize(link,infinity,infinity,keys(1,2)).
materialize(reachable,infinity,infinity,keys(1,2)).

d1 reachable(@Src, Dest, Cost) :-
	link(@Src, Dest, Cost).

d2 reachable(@Src, Dest, Cost) :-
	link(@Src, Mid, Cost1),
	reachable(@Mid, Dest, Cost2),
	Cost := Cost1 + Cost2.

d3 reachable(@Src, Dest, Cost) :-
	reachable(@Src, Mid, Cost1),
	link(@Mid, Dest, Cost2),
	Cost := Cost1 + Cost2.






























