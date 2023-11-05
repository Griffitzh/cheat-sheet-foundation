public class SQLwaste {
    //Multiple CASE WHEN plus group by order by with a hint of SUM
    /*
    SELECT mdate, team1,
    SUM(CASE WHEN teamid=team1 THEN 1 ELSE 0 END) as score1,
    team2,
    SUM(CASE WHEN teamid=team2 THEN 1 ELSE 0 END) as score2
    FROM game JOIN goal ON matchid = id
    GROUP BY
        mdate,
        matchid,
        team1,
        team2
    ORDER BY
        mdate,
        matchid,
        team1,
        team2;
     */

    /* COUNT AND LOGICAL OPERATOR IN WHERE
    Select DISTINCT matchid, mdate, COUNT(teamid)
        from goal
        JOIN game on matchid = id
        WHERE teamid = "GER" && (team1 = "GER" || team2 = "GER")
        GROUP BY id
     */

    /* Reverse Search
    Select DISTINCT player
        from goal
        JOIN game on matchid = id
        WHERE teamid != "GER" && (team1 = "GER" || team2 = "GER")
     */

    /* SEARCH for a certain STRING PIECE
    SELECT team1, team2, player
        FROM game
        JOIN goal ON (id=matchid)
        WHERE player LIKE "%Mario%"
     */

    /* COUNTING with the use of HAVING
    SELECT continent
        FROM world
        GROUP BY continent
        HAVING SUM(population) > 100000000
     */
}
