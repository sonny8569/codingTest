def solution(genres, plays):
    genresDic = {}
    answer = [] 
    for genere  , play in zip(genres , plays):
        if genere in genresDic :
            genresDic[genere] += play
        else :
            genresDic[genere] = play
    genresDic = sorted(genresDic.items() , key =lambda x : x[1] , reverse= True)

    albumList = [] 
    for index ,(genere , play) in enumerate(zip(genres , plays)):
        albumList.append([genere , play , index])
    albumList = sorted(albumList , key = lambda x : x[1], reverse=True)

    for key , value in genresDic:
        count = 0
        for genre , play , index in albumList :
            if count < 2:
                if key == genre :
                    answer.append(index)
                    count +=1 

    return answer

solution(["classic", "pop", "classic", "classic", "pop"] ,[500, 600, 150, 800, 2500])