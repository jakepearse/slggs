import ngram_score as ns
import random
from pycipher_simplesub import SimpleSubstitution as simpleSub
fitness = ns.ngram_score('english_quintgrams.txt')
#print fitness.score('HELLOWORLD')
c="LWW RLFW TD OTGTOPO TYEZ ESCPP ALCED ZYP ZQ HSTNS ESP MPWRLP TYSLMTE ESP LBFTELYT LYZESPC ESZDP HSZ TY ESPTC ZHY WLYRFLRP LCP NLWWPO NPWED TY ZFC RLFWD ESP ESTCO LWW ESPDP OTQQPC QCZX PLNS ZESPC TY WLYRFLRP NFDEZXD LYO WLHD"
## GA


alph = list('ABCDEFGHIJKLMNOPQRSTUVWXYZ')

def rand_solution(length):
  ## generate a random solution key
  pop = [i.upper() for i in alph]
  random.shuffle(pop)
  return pop

def get_fitness(solution_list):
  s=""
  print(solution_list)
  for letter in solution_list:
    #if type(letter) is'str':
    s = s + letter ## this might be better with .join()
  if len(s)!=26:
    print(s)
  p = simpleSub(s).decipher(c)
  solution_fitness = abs(1/fitness.score(p))
  return solution_fitness

rand_pop = [rand_solution(26) for i in range(10)] ## 10 candidates of length 26
current_pop = [i for i in rand_pop]
for i in range(10):
  total = 0
  fit_pop =[]
  for solution in current_pop:
    sl =[]
    f = get_fitness(solution)
    sl.append(f)
    total += f
    fit_pop.append(solution+sl)
  indices= range(len(solution))
  indices.sort(key=fit_pop[-1].__getitem__)
  for j, sublist in enumerate(fit_pop):
    fit_pop[j] = [sublist[k] for k in indices]+[fit_pop[j]]
    
  new_pop = [fit_pop[0]+fit_pop[1]]
  while len(new_pop) < len(rand_pop):
    if random.random() <= 0.5:
      new_solution = rand_solution(26)
      new_pop.append(new_solution)
    else:
      candidateA = random.choice(fit_pop)
      candidateB = random.choice(fit_pop)
      if candidateA[-1]<candidateB[-1]:
        new_pop.append([i for candidateA[i] in range(26)])
      else:
        new_pop.append([i for candidateB[i] in range(26)])
  current_pop = [i for i in new_pop]
for i in current_pop:
  print(i)
print(total/10)
